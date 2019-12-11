package ec.edu.ups.on;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.EmpresaDAO;
import ec.edu.ups.model.Empresa;

@Stateless
public class EmpresaON {

	@Inject
	private EmpresaDAO eDAO;
	
	public void crearEmpresa (Empresa e) {
		eDAO.create(e);
	}

	public void actualizarEmpresa (Empresa e) {
		eDAO.update(e);
	}
	
	
}

