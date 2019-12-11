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
public class Factura {

	@Id
	@GeneratedValue
	@Column (name = "fact_codigo")
	private int codigo;
	@Column (name = "fact_fecha")
	private String fecha;
	@NotNull
	@Column (name = "fact_sub_total")
	private double subTotal;
	@NotNull
	@Column (name = "fact_iva")
	private double iva;
	@NotNull
	@Column (name = "fact_descuento")
	private String descuento;
	@NotNull
	@Column (name = "fact_cost_envio")
	private double costoEnvio;
	@NotNull
	@Column (name = "fact_total")
	private double total;
	@NotNull
	@Column (name = "fact_estado")
	private String estado;

	@OneToMany (mappedBy="factura",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<DetalleFactura> detalleFacturas;
	
	
	@OneToOne
	@JoinColumn (name ="cli_codigo")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn ( name = "tar_fact_id")
	private Tarjeta tarjeta;
	
	@OneToOne
	@JoinColumn (name = "dir_fact_id")
	private Direccion direccion;
	
	@OneToOne
	@JoinColumn (name = "emp_codigo")
	private Empresa empresa;
	
	
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
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public double getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public List<DetalleFactura> getDetalleFacturas() {
		return detalleFacturas;
	}
	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	
}
