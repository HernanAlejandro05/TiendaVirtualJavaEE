package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.Query;
import javax.persistence.EntityManager;

import ec.edu.ups.model.Empresa;

@Stateless
public class EmpresaDAO {

	@Inject
	private EntityManager em;
	
	public void guardar(Empresa e) {
		if(this.read(e.getCodigo())!=null) {
			this.update(e);
			
		}else {
			this.create(e);
		}
	}
	
	public void create (Empresa e) {
		em.persist(e);
	}
	public Empresa  read (int codigo) {
		return em.find(Empresa.class, codigo);
	}
	
	public void update (Empresa e) {
		em.merge(e);
	}
//	public void delete (int codigo) {
//		Empresa e = read(codigo);
//		em.remove(e);
//		
//	}

//	public List<Empresa> listaEmpresas (){
//		String jpql = "SELECT e FROM Empresa e";
//		Query q =  em.createQuery(jpql, Empresa.class);
//		List<Empresa> empresas = q.getResultList();
//		
//		return empresas;
//		
//		
//	}
//	
//	
//	public List <Empresa> listarporNombre (String filtroBusqueda){
//		String jpql = "SELECT e FROM Empresa e" + 
//						"WHERE e.descripcion LIKE :filtro ";
//		Query q= em.createQuery(jpql , Empresa.class);
//		q.setParameter("filtro", "%" + filtroBusqueda + "%");
//		List<Empresa> empresas = q.getResultList();
//		return empresas;
//		
//		
//	}
	
}
