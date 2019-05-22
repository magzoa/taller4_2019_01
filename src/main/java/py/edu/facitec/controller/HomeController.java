package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Responde a la raiz del proyecto
	@RequestMapping("/")
	public String home() {
		
System.out.println("Cargando página de inicio");
		
//Crear este archivo dentro de webapp
//carpeta o nombre de archivo
return "view/templates/index";
	}
	
	//url
	@RequestMapping("/menu")
	public String variable() {
		
		
		System.out.println("Cargando el menu");
		//página
		return "view/templates/menu";
	}
	
	

}
