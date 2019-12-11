package ec.edu.ups.model;

import java.util.Date;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	@Column (name= "cli_codigo")
	private int codigo;
	@Column (name= "cli_cedularuc")
	private String cedulaRuc;
	@Pattern(regexp = "[^0-9]*", message = "Campo no admite numeros")
	@Column (name= "cli_nombre")
	private String nombre;
	@Column (name= "cli_apellido")
	private String apellido;
	@Column (name= "cli_fecha_nac")
	private String fechaNacimiento;
	@Column (name= "cli_telefono")
	private String telefono;
	@Email
	@NotEmpty
	@Column (name= "cli_email")
	private String email;
	@Column (name = "cli_clave")
	private String clave;
	@Column (name= "cli_fechaRegistro")
	private String fechaRegistro;
	
	
	@OneToMany (mappedBy="cliente",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Voto> votos;
	
	@OneToMany (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn (name = "fact_codigo")
	private List<Factura> facturas;
	
	@OneToMany (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn (name = "dir_codigo")
	private List<Direccion> direcciones;
	
	@OneToMany (cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn (name = "tar_codigo")
	private List<Tarjeta> tarjetas;
		
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCedulaRuc() {
		return cedulaRuc;
	}
	public void setCedulaRuc(String cedulaRuc) {
		this.cedulaRuc = cedulaRuc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	
}
