package ec.edu.ups.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {

	@Id
	private int codigo;
	private String nombre;
	private String ruc;
	private String direccion;
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