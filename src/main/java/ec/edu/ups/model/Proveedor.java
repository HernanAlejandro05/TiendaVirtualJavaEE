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

@Entity
public class Proveedor {

	@Id
	@Column (name = "prov_codigo")
	@GeneratedValue
	private int codigo;
	@Column (name = "prov_ruc")
	private String ruc;
	@Column (name = "prov_direccion")
	private String direccion;
	@Column (name = "prov_telefono")
	private String telefono;
	@Column (name = "prov_email")
	private String email;
	
	@OneToMany (mappedBy = "proveedor" ,cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Producto> productos;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	
}
