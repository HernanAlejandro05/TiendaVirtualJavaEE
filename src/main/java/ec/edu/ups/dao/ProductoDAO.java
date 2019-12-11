package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Producto;

@Stateless
public class ProductoDAO {

	@Inject
	private EntityManager em;
	
	public void guardar (Producto pro){
		
	}
	
	public void create (Producto pro) {
		em.persist(pro);
	}
	public Producto read(int codigo) {
		return em.find(Producto.class, codigo);
		
	}
	public void update  (Producto pro) {
		em.merge(pro);
	}
	public void delete (int codigo) {
		Producto pro = read(codigo);
		em.remove(pro);
	}
	
	public List<Producto> listProd(){

		String jpql = "SELECT  FROM Producto p";
		Query q = em.createQuery(jpql, Producto.class);
		List<Producto> productos = q.getResultList();

		return productos;

	}
	public List<Producto> listPorCategoria(String categoria) {
		String jpql = "SELECT p "
				+ "FROM Producto p "
				+ "Where p.categoria.nombre LIKE ?1";
		Query q = em.createQuery(jpql, Producto.class);
		q.setParameter(1, categoria);
		List<Producto> productos = q.getResultList();
		return productos;

	}


}
