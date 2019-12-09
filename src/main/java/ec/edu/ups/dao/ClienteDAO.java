package ec.edu.ups.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class ClienteDAO {
	
	@Inject
	private EntityManager em;

}
