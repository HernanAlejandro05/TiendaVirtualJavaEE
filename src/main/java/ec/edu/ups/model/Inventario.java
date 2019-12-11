package ec.edu.ups.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Inventario {

	@Id
	@Column (name = "inv_codigo")
	@GeneratedValue
	private int codigo;
	@Column (name = "inv_fecha")
	private String fecha;
	@Column (name = "inv_desc")
	private String descripcion;
	@Column (name = "inv_cant_compra")
	private int cantidadCompra;
	@Column (name = "inv_precio_compra")
	private double precioCompra;
	@Column (name = "inv_precio_t_compra")
	private double precioTotalCompra;
	@Column (name = "inv_cant_venta")
	private int cantidadVenta;
	@Column (name = "inv_precio_unit")
	private double precioUnitario;
	@Column (name = "inv_pre_existencia")
	private double precioExistenca;
	

	@OneToMany (mappedBy="categoria",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Producto> productos;
	
	@OneToOne 
	@JoinColumn (name = "cab_inv_codigo")
	private CabeceraInventario cabeceraInventario;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public CabeceraInventario getCabeceraInventario() {
		return cabeceraInventario;
	}
	public void setCabeceraInventario(CabeceraInventario cabeceraInventario) {
		this.cabeceraInventario = cabeceraInventario;
	}
	
	
}
