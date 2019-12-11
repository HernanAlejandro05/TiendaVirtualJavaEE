package ec.edu.ups.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.model.Cliente;
import ec.edu.ups.on.ClienteON;

@ManagedBean
@ViewScoped
public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Cliente> listaClientes;
	private List<Cliente> listadoNombres;

	@Inject
	private ClienteON cliON;

	@PostConstruct
	public void init() {
		listaClientes = cliON.listaCLientes();
	}

	public String cargarDatos() {
	
		try {
				cliON.guardar(cliente);
				init();
		}catch (Exception e) {
			
				e.printStackTrace();
			}
			return null;
	
		

	}
	

	public String editar(int codigo) {
		System.out.println("Codigo Editar:" + codigo);
		cliente = cliON.getClientes(codigo);
		System.out.println(cliente);

		return "clientes.xhtml";

	}

	public String borrar( int codigo) {
		System.out.println("Codigo :" + codigo);
		
		try {
			cliON.eliminar(codigo);
			init();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String buscar () {
		System.out.println("Filtro:" + cliente.getNombre());
		listadoNombres=cliON.listadoporNombres(cliente.getNombre());
		cliON.listadoporNombres(cliente.getNombre());
		return null;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public List<Cliente> getListadoNombres() {
		return listadoNombres;
	}

	public void setListadoNombres(List<Cliente> listadoNombres) {
		this.listadoNombres = listadoNombres;
	}

}
