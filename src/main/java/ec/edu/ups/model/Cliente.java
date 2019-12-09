package ec.edu.ups.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Temporal(TemporalType.DATE)
	@Column (name= "cli_fecha_nac")
	private Date fechaNacimiento;
	@Column (name= "cli_telefono")
	private String telefono;
	@Column (name= "cli_direccion")
	private String direccion;
	@Email
	@NotEmpty
	@Column (name= "cli_email")
	private String email;
	@Column (name= "cli_fechaRegistro")
	private Date fechaRegistro;
	
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
}
