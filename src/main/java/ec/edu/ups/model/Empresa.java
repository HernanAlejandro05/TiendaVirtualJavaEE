package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author alejo
 *
 */
@Entity
public class Empresa {

	@Id
	@Column (name = "emp_codigo")
	private int codigo;
	@Column (name = "emp_nombre")
	@Size (min = 5 , max = 25)
	@NotNull
	private String nombre;
	@Column (name = "emp_ruc")
	private String ruc;
	@Column (name = "emp_direccion")
	private String direccion;
	@Column (name = "emp_anioCreacion")
	private String anioCreacion;
	
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
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getAnioCreacion() {
		return anioCreacion;
	}
	public void setAnioCreacion(String anioCreacion) {
		this.anioCreacion = anioCreacion;
	}
	
	
}
