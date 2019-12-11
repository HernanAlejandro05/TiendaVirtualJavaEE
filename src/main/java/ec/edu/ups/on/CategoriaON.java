package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.CategoriaDAO;
import ec.edu.ups.model.Categoria;

@Stateless
public class CategoriaON {

	@Inject
	private CategoriaDAO cDAO;
	
	
	public void crearCategoria (Categoria cat) {
		cDAO.create(cat);
	}
	public void actalizarCategoria(Categoria cat) {
		cDAO.update(cat);
	}
	public void eliminarCategoria (int codigo) {
		cDAO.delete(codigo);	
	}
	public void buscarCategoria(int codigo) {
		cDAO.buscarCategoria(codigo);
	}
	
	public List<Categoria> listaCategorias() {
		return cDAO.obtenerCategoria();
	}
	
	
}
