package py.edu.facitec.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.dao.ProductoDAO;
import py.edu.facitec.model.Producto;

//Trabajar con la arquitectura REST
@RestController
@Transactional

//afectara a todos los metodos
@RequestMapping("/productos")
public class ProductoController {

	@Autowired //Inyección de dependencia
	private ProductoDAO productoDAO;
	

@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)	
public ResponseEntity<List<Producto>> getLista(){
		
List<Producto> lista=productoDAO.getLista();	
		
		
		
		return new ResponseEntity<List<Producto>>(lista,HttpStatus.OK);
	}
								//@RequestBody para convertir json a java
@RequestMapping(method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)	
public ResponseEntity<Producto> guardar(@RequestBody Producto producto){
		
		
		productoDAO.guardar(producto);
	
	
		return new ResponseEntity<Producto>(producto,HttpStatus.OK);
	}

											//@PathVariable para obtener el dato de {id}
@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,value="/{id}")	
public ResponseEntity<Producto> getProductos(@PathVariable Integer id){
		
		
	Producto producto=productoDAO.buscar(id);
	
	if(producto !=null) {
		return new ResponseEntity<Producto>(producto,HttpStatus.OK);
	}
	
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}


@RequestMapping(method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE,value="/{id}")	
public ResponseEntity<Producto> eliminar(@PathVariable Integer id){
		
		
	Producto producto=productoDAO.buscar(id);
	
	if(producto !=null) {
		
		productoDAO.eliminar(producto);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}











	
	
	
	
	
	
}
