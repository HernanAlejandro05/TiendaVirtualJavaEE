package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Categoria;
import ec.edu.ups.model.Producto;

@Stateless
public class CategoriaDAO {

	@Inject
	private EntityManager em;
	
	public void guardar (Categoria cat) {
		if (this.read(cat.getCodigo()) != null)
			this.update(cat);
		else
			this.create(cat);

	}
	public void create(Categoria cat) {
		em.persist(cat);
	}

	public Categoria read(int id) {
		return em.find(Categoria.class, id);
	}

	public void update(Categoria cat) {
		em.merge(cat);
	}

	public void delete(int id) {
		Categoria cat = read(id);
		em.remove(cat);
	}

	public Categoria buscarCategoria(int codigo) {
		String jpql = "SELECT cat from Categoria cat JOIN FETCH  cat WHERE cat.codigo =:codigo";
		Query q = em.createQuery(jpql, Categoria.class);
		q.setParameter("codigo", codigo);
		Categoria categoria = (Categoria) q.getResultList();
		return categoria;
	}
	
	
	public List<Categoria> obtenerCategoria() {
		String jpql = "SELECT cat FROM Categoria cat ";
		Query q = em.createQuery(jpql, Categoria.class);
		List<Categoria> categorias = q.getResultList();
		return categorias;
	}
	
	public List<Categoria> obtenerCategoria2() {
		String jpql = "SELECT cat FROM CategoriaEN cat ";
		Query q = em.createQuery(jpql, Categoria.class);
		List<Categoria> categorias = q.getResultList();
		for (Categoria cat : categorias) {
			cat.getProductos().size();
		}

		return categorias;
	}

	public List<Producto> getProductos() {
		String jpql = "SELECT prod FROM ProductoEN prod";

		Query q = em.createQuery(jpql, Producto.class);
		List<Producto> prod = q.getResultList();
		return prod;

	}


}
