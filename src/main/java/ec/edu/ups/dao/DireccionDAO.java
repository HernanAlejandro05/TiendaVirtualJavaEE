package ec.edu.ups.dao;

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Direccion;

@Stateless
public class DireccionDAO {

	@Inject
	private EntityManager em;
	
	public void guardar (Direccion dir) {
		
	}
	
	public void create (Direccion dir) {
		if (this.read(dir.getCodigo()) != null)
			this.update(dir);
		else
			this.create(dir);

	}
	public Direccion read (int codigo) {
		
		return em.find(Direccion.class, codigo);
		
	}
	public Direccion readNombre (String nombre) {
		return em.find(Direccion.class, nombre);
		
	}
	
	public void update (Direccion dir) {
		em.merge(dir);
	}
	public void delete (int codigo) {
		Direccion dir  = read(codigo);
		em.remove(dir);
	}
	
	public List<Direccion> listaDirecciones(){
		String jpql = "SELECT dir FROM Direccion dir";
		Query q = em.createNativeQuery(jpql, Direccion.class);
			List<Direccion> direcciones = q.getResultList();
			return direcciones;
		
	}
	
	public List<Direccion> listaDirecciones2(){
		String jpql = "SELECT dir FROM Direccion dir";
		Query q = em.createNativeQuery(jpql, Direccion.class);
			List<Direccion> direcciones = q.getResultList();
			for (Direccion dir : direcciones) {
				dir.getFactura().getCodigo();
				}
			return direcciones;
		
	}
	
}
