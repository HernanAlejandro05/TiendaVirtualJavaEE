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
import javax.validation.constraints.NotNull;

@Entity
public class DetalleFactura {

	@Id
	@Column (name= "det_codigo")
	@GeneratedValue
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
	
	@OneToMany (mappedBy="categoria",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	private List<Producto> productos;
	
	@OneToOne
	@JoinColumn (name = "fact_codigo")
	private Factura factura;
	
	
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
}
