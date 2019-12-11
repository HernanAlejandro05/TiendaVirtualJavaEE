package ec.edu.ups.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import ec.edu.ups.model.Voto;
import ec.edu.ups.on.VotoON;

@ManagedBean
@ViewScoped
public class VotoBean {

	@Inject
	private VotoON vON;
	private List <Voto> votos;
	private Voto voto;
	
	private FacesContext fc;
    
	
	
}
