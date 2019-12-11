package ec.edu.ups.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder.In;

import ec.edu.ups.model.Inventario;
@Stateless
public class InventarioDAO {

	@Inject
	private EntityManager em;
	
	public void guardar (Inventario inv) {
		if (this.read(inv.getCodigo()) != null)
			this.update(inv);
		else
			this.create(inv);
	
	}
	
	public void create (Inventario inv) {
		em.persist(inv);
		
	}
	public Inventario read (int codigo) {
		return em.find(Inventario.class, codigo);
	}
	public void  update (Inventario inv) {
		em.merge(inv);
	}
	
	
	public void read2 () {
		
	}
}
