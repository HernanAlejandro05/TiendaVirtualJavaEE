package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.model.Cliente;

@Stateless
public class ClienteDAO {
	
	@Inject
	private EntityManager em;

	public void  guardar (Cliente c) {
		if (this.read(c.getCodigo()) != null) {
			this.update(c);
		}else {
			this.create(c);
		}

	}
	
	public void create(Cliente c) {
		em.persist(c);

	}

	public Cliente read(int codigo) {
		return em.find(Cliente.class, codigo);

	}

	public Cliente read2(int codigo) {
		Cliente c = em.find(Cliente.class, codigo);
		return c;

	}

	public Cliente read3(int id) {

		String jpql = "SELECT c FROM Cliente c JOIN FETCH c.direcciones d "
				+ " WHERE c.codigo = :a";

		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("a", id);
		Cliente c = (Cliente) q.getSingleResult();

		return c;

	}
	
	public Cliente buscarUser(int codigo) {
		String jpql = "SELECT c FROM Cliente c JON FETCH c where c.codigo = :codigo";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("codigo", codigo);
		Cliente cliente = (Cliente) q.getSingleResult();
		return cliente;
	}
	public void update(Cliente c) {
		em.merge(c);

	}

	public void delete(int codigo) {
//		Cliente c = read(id);
		em.remove(read(codigo));
	}

	public Cliente getusuarios(String email,String clave) {
		Cliente cli=null;

			String jpql="SELECT c FROM Cliente c WHERE c.email =: email AND c.clave =: clave";
			Query q = em.createQuery(jpql, Cliente.class);
			q.setParameter("email", email);
			q.setParameter("clave", clave);
			List<Cliente> clienteLista = q.getResultList();
			if(!clienteLista.isEmpty()) {
				cli=clienteLista.get(0);
			}else {
				cli=null;
			}
		return cli;
		}

	
//	public List<Cliente> getClienteNombre(String nombre) {
//		String jpql = "SELECT  c FROM Cliente c WHERE c.nombre LIKE ?1 ";
//		Query q = em.createQuery(jpql, Cliente.class);
//		q.setParameter(1, nombre);
//		Cliente cliente = (Cliente) q.getSingleResult();
//		return (List<Cliente>) cliente;
//
//	}
	public List<Cliente> listado (){
		String jpql = "SELECT  c FROM Cliente c ";
		Query q = em.createQuery(jpql, Cliente.class);
		List<Cliente> clientes = q.getResultList();
		for (Cliente cliente : clientes) {
			cliente.getDirecciones().size();
		}
		return clientes;
		
	}
	
	public List <Cliente> getByNombre (String filtroBusqueda){
		String jpql= "SELECT c FROM Cliente c"
				+ "WHERE c.nombre like :filtro";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter("filtro", "%"+filtroBusqueda +"%");
		
		List<Cliente> clientes = q.getResultList();
		System.err.println(clientes);
		return clientes;
		
	}

}
