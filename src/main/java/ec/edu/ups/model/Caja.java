package ec.edu.ups.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Caja {
	
	@Id
	@GeneratedValue
	@Column (name = "ca_codigo")
	private int codigo;
	private double saldoTotal;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	
}
