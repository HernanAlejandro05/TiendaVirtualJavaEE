package ec.edu.ups.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Producto {

	@Id
	@Column (name = "pro_codigo")
	@GeneratedValue
	private int codigo;
	@Column (name = "pro_nombre")
	@NotNull
	private String nombre;
	@Column (name = "pro_descripcion")
	@NotNull
	private String descripcion;
	@Column (name = "pro_img")
	private String image;
	@Column (name = "pro_precio_compra")
	@NotNull
	private double precioCompra;
	@Column (name = "pro_precio_venta")
	@NotNull
	private double precioVenta;
	@Column (name = "pro_stock")
	@NotNull
	private int stock;
    @Column (name = "pro_estado")
    @NotNull
	private String estado;
    
    @OneToMany (mappedBy="cliente",cascade = CascadeType.ALL , fetch= FetchType.LAZY)
	private List<Voto> votos ;
	
	@OneToOne
	@JoinColumn(name = "cat_codigo" )
	private Categoria categoria;
	
	
	//fhth
	@OneToOne
	private Proveedor proveedor;
	
	@OneToOne
	@JoinColumn (name = "det_codigo")
	private DetalleFactura detalle;
	
	@OneToOne
	@JoinColumn (name = "inv_codigo" )
	private Inventario inventario;
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public DetalleFactura getDetalle() {
		return detalle;
	}
	public void setDetalle(DetalleFactura detalle) {
		this.detalle = detalle;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	
}
