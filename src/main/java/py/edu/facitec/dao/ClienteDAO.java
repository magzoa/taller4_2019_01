package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;

@Repository //Indicamos a Spring conección con bd

			//Completamos el objeto con que trabajara
			//el DAOGenerico
public class ClienteDAO extends DAOGenerico<Cliente>{
	
	public ClienteDAO() {
		
//Completamos la clase con que trabajara el DAOGenerico		
		super(Cliente.class);
		
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
