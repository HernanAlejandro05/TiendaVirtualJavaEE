package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Direccion;
import ec.edu.ups.model.Tarjeta;
import ec.edu.ups.model.Voto;

@Stateless
public class VotoDAO {

	@Inject
	private EntityManager em;
	
	
	public void guardar (Voto v) {
		if (this.read(v.getCodigo()) != null)
			this.update(v);
		else
			this.create(v);
	}
	
	public Voto read (int codigo) {
		 em.find(Voto.class, codigo);
		 return null;
	}
	
	public void create (Voto v) {
		em.persist(v);
	}
	public void update (Voto v) {
		em.merge(v);
	}
	
	public void  delete ( int codigo) {
		Voto v = read(codigo);
		em.remove(v);
	}
	

	
	public List<Voto> listaVotos(){
		String jpql = "SELECT v FROM Direccion v";
		Query q = em.createNativeQuery(jpql, Direccion.class);
			List<Voto> votos = q.getResultList();
			return votos;
		
	}
}
