package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class DetalleFactura {

	@Id
	@Column (name= "det_codigo")
	private int codigo;
	@Column (name= "det_descripcion")
	private String descripcion;
	@Column (name= "det_cantidad")
	@NotNull
	private int cantidad;
	@Column (name= "det_precioUnitario")
	@NotNull
	private double precioUnitario;	
	@Column (name= "det_precioTotal")
	@NotNull
	private double precioTotal;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
