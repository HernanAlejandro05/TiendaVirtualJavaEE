package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.model.Cliente;

@Stateless
public class ClienteON {

	@Inject
	private ClienteDAO cliDAO;

	public void crearUser(Cliente c) {
		cliDAO.create(c);
	}

	public void actualizarCliente(Cliente c) {
		cliDAO.update(c);
	}

	public void eliminarCliente(int codigo) {
		cliDAO.delete(codigo);
	}

	public Cliente buscarCliente(int codigo) {
		return cliDAO.buscarUser(codigo);

	}

	public List<Cliente> listaCLientes() {
		return cliDAO.listado();

	}

	public void guardar(Cliente c) throws Exception {
		cliDAO.guardar(c);
	}

	public Cliente getClientes(int codigo) {
		Cliente cli = cliDAO.read3(codigo);
		return cli;
	}

	public void eliminar(int codigo) throws Exception {

		try {
			cliDAO.delete(codigo);
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
				e.printStackTrace();
		}
	}
	public List<Cliente> listadoporNombres(String nombre){
		return cliDAO.getByNombre(nombre);
	}

}
