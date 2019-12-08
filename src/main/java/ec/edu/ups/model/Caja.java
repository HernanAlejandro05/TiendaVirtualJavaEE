package ec.edu.ups.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Caja {
	
	@Id
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
