package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.ClienteDAO;
import py.edu.facitec.model.Cliente;

@Transactional //Para trabajar con transacciones en Spring
@Controller
public class ClienteController {
	
	//clientes 
	@RequestMapping("/clientes")
	public String formCliente() {
		
		System.out.println("Ingrese a Formulario de Cliente");
		return "view/cliente/form";
	}
	//form.html
	
	@Autowired //Inyección de dependencias´
				//Creación de objeto
	private ClienteDAO clienteDAO;
	
				// propiedad action del formulario - url
	@RequestMapping("/cliente")
	//Recibe los datos del form.html y carga en cliente
	public String registrarCliente(Cliente cliente) {
		
		System.out.println(cliente);
		clienteDAO.guardar(cliente);
		System.out.println("Controlador de Cliente");
				//pagina de retorno...
		return "view/cliente/form";
	}
	
	
	
	
	
	

}
