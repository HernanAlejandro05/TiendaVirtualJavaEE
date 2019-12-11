package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.ProductoDAO;
import ec.edu.ups.model.Producto;

@Stateless
public class ProductoON {

	@Inject
	private ProductoDAO proDAO;
	
	public void crearProducto (Producto pro) {
		proDAO.create(pro);
	}
	
	public void actualizarProducto (Producto pro) {
		proDAO.update(pro);
		
	}
	
	public void eliminarProducto(int codigo) {
		proDAO.delete(codigo);
	}
	
	public List<Producto> listado(){
		return proDAO.listProd();
	}
}
