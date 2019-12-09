package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Categoria {

	@Id
	@Column (name= "cat_codigo")
	private int codigo;
	@NotNull
	@Column (name= "cat_nombre")
	@Size (min=4 , max=20)
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
