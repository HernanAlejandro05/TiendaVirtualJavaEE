package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Proveedor;

@Stateless
public class ProveedorDAO {

	@Inject
	private EntityManager em;


	public void save(Proveedor prov) {
		if (this.read(prov.getCodigo()) != null)
			this.update(prov);
		else
			this.create(prov);
	}
	
	public  void create (Proveedor prov) {
		em.persist(prov);
	}
	public Proveedor read (int codigo) {
		return em.find(Proveedor.class, codigo);
	}
	
	public Proveedor readporNombre(String nombre) {
		return em.find(Proveedor.class, nombre);
	}
	
	public Proveedor read2(int id) {
		Proveedor prov = em.find(Proveedor.class, id);
		prov.getProductos().size();
		return prov;
	}


	public void update(Proveedor prov) {
		em.merge(prov);
	}

	public void delete(int id) {
		Proveedor prov = read(id);
		em.remove(prov);
	}

	public List<Proveedor> getProveedor() {
		String jpql = "SELECT prov FROM Proveedor prov ";
		Query q = em.createQuery(jpql, Proveedor.class);
		List<Proveedor> proveedores = q.getResultList();
		return proveedores;
	}

	public List<Proveedor> getProveedor2() {
		String jpql = "SELECT prov FROM Proveedor prov ";
		Query q = em.createQuery(jpql, Proveedor.class);
		List<Proveedor> proveedores = q.getResultList();
		for (Proveedor prov : proveedores) {
			prov.getProductos().size();
		}

		return proveedores;
	}

}

