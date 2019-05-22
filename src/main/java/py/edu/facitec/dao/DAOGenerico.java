package py.edu.facitec.dao;

import java.util.List;

import javax.persistence.EntityManager;

public abstract class DAOGenerico<T> {

	private Class<T> entityClass;

	public DAOGenerico(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void insertar(T entity) {
		getEntityManager().persist(entity);// Es manipulado por EM
	}

	// METODO PARA ACTUALIZAR
	public void actualizar(T entity) {
		getEntityManager().merge(entity);// actualiza
	}

	// METODO PARA BUSCAR
	public T buscar(Object id) {
		// System.out.println("Entidad: "+getEntityManager().find(entityClass,
		// id));
		return getEntityManager().find(entityClass, id);

	}

	// METODO PARA GUARDAR
	public void guardar(T entity) {
			
		
		    	Object id = getEntityManager().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);    	
		    	
		    	System.out.println("El id en guardar es: "+id);
		    	if(id!=null){
		    	if(buscar(id)==null){   	   	
		        	getEntityManager().persist(entity);
		    	}else{  	   	
		        	getEntityManager().merge(entity);
		    	}
		    	}else{
		    		getEntityManager().persist(entity);
		    	}
	}

	// METODO QUE RETORNA UNA LISTA DE UNA ENTIDAD
	public List<T> getLista() {							//Producto , Cliente		Producto{propiedades}
		return getEntityManager().createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();

	}


	// Metodo para eliminar
	public void eliminar(T entity) {

		getEntityManager().remove(getEntityManager().contains(entity) ? entity : getEntityManager().merge(entity)

		);

	}

	
	
	

} 
