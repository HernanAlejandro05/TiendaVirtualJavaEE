package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.dao.VotoDAO;
import ec.edu.ups.model.Voto;

@Stateless
public class VotoON {

	@Inject
	private VotoDAO vDAO;
	
	public void guardarVoto (Voto v){
		vDAO.create(v);
	}
	public void actualizarVoto(Voto v){
		vDAO.update(v);
	}
	public void eliminarProducto (int codigo){
		vDAO.delete(codigo);
	}
	public List<Voto> listado (){
		return vDAO.listaVotos();
	}
}
