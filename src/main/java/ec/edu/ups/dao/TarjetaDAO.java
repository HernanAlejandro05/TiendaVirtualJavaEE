package ec.edu.ups.dao;

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Direccion;
import ec.edu.ups.model.Empresa;
import ec.edu.ups.model.Tarjeta;

@Stateless
public class TarjetaDAO {

	@Inject
	private EntityManager em;
	
	
	public void guardar (Tarjeta tar) {
		if (this.read(tar.getCodigo()) != null)
			this.update(tar);
		else
			this.create(tar);
	}

	
	public void create (Tarjeta tar) {
		em.persist(tar);
	}
	public Tarjeta read (int codigo) {
		return em.find(Tarjeta.class, codigo);
		
	}
	
	public void update (Tarjeta tar) {
		em.merge(tar);
	}
	
	public void delete (int codigo) {
		Tarjeta tar = read(codigo);
		em.remove(tar);
			
	}
	public List<Tarjeta> listaTarjetas(){
		String jpql = "SELECT tar FROM Tarjeta tar";
		Query q = em.createNativeQuery(jpql, Tarjeta.class);
			List<Tarjeta> tarjetas = q.getResultList();
			return tarjetas;
		
	}
	public List<Tarjeta> listaRarjetas2(){
		String jpql = "SELECT tar FROM Tarjeta tar";
		Query q = em.createNativeQuery(jpql, Tarjeta.class);
			List<Tarjeta> tarjetas = q.getResultList();
			for (Tarjeta tar : tarjetas) {
				tar.getFactura().getCodigo();
			}
			return tarjetas;
		
	}
}
