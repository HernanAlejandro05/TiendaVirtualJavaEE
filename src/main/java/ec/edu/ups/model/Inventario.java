package ec.edu.ups.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventario {

	@Id
	private int codigo;
	private Date fecha;
	private String descripcion;
	private int cantidadCompra;
	private double precioCompra;
	private double precioTotalCompra;
	private int cantidadVenta;
	private double precioUnitario;
	private double precioExistenca;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidadCompra() {
		return cantidadCompra;
	}
	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioTotalCompra() {
		return precioTotalCompra;
	}
	public void setPrecioTotalCompra(double precioTotalCompra) {
		this.precioTotalCompra = precioTotalCompra;
	}
	public int getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getPrecioExistenca() {
		return precioExistenca;
	}
	public void setPrecioExistenca(double precioExistenca) {
		this.precioExistenca = precioExistenca;
	}
	
	
}
