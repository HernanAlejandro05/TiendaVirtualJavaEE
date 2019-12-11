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
public class CabeceraInventario {

	@Id
	@Column (name = "cab_inv_codigo")
	@GeneratedValue
	private int codigo;
	@Column (name = "cab_inv_fecha")
	private String fecha;
	
	@OneToMany (mappedBy="cabeceraInventario",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Inventario> inventarios;
	
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
	
	
	public List<Inventario> getInventarios() {
		return inventarios;
	}
	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
	@Override
	public String toString() {
		return "CabeceraInventario [codigo=" + codigo + ", fecha=" + fecha + "]";
	}

	
	
}
