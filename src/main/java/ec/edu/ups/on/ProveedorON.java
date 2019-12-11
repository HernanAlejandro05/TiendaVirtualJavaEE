package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.ProveedorDAO;
import ec.edu.ups.model.Proveedor;

@Stateless
public class ProveedorON {

	@Inject
	private ProveedorDAO provDAO;
	
	public void crearProveedor (Proveedor prov) {
		provDAO.create(prov);
	}
	public void actualizarProveedor(Proveedor prov) {
		provDAO.update(prov);	
	}
	public void eliminarProveedor (int codigo) {
		provDAO.delete(codigo);
	}
	public List<Proveedor> listado(){
		return provDAO.getProveedor();
		
	}
	
}
