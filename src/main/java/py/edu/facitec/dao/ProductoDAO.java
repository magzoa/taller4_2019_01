package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;
import py.edu.facitec.model.Producto;

@Repository //Indicamos a Spring conección con bd

			//Completamos el objeto con que trabajara
			//el DAOGenerico
public class ProductoDAO extends DAOGenerico<Producto>{
	
	public ProductoDAO() {
		
//Completamos la clase con que trabajara el DAOGenerico		
		super(Producto.class);
		
	}

	//Unidad de Persistencia
	@PersistenceContext
	//Administrador de Entidades
	private EntityManager em;

	
	@Override
	protected EntityManager getEntityManager() {
		
		return em;
	}
	
	
	
	

}
