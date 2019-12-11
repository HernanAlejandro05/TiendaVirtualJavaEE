package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Direccion {

	@Id
	@GeneratedValue
	@Column (name = "dir_codigo")
	private int codigo;
	@Column (name = "dir_numero")
	@NotNull
	private String numero;
	@Column (name = "dir_calle_pri")
	private String callePrincipal;
	@Column (name = "dir_calle_sec")
	private String calleSecundaria;
	
	@OneToOne
	@JoinColumn (name ="cli_codigo")
	private Cliente cliente;

	@OneToOne
	@JoinColumn (name = "dir_fact_id")
	private Factura factura;
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	
	
	
}
