package ec.edu.ups.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {

	@Id
	private int codigo;
	private String nombre;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
