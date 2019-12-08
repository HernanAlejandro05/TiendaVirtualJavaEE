package ec.edu.ups.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pago {

	@Id
	private int codigo;
	private String formaPago;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	
}
