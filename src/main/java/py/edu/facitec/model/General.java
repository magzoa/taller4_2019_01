package py.edu.facitec.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class General {

@Id					//Genera a partir de una columna
				//autoincrementable de la bd
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;

public General() {

}




public Integer getId() {
	return id;
}




public void setId(Integer id) {
	this.id = id;
}




@Override
public String toString() {
	return "General [id=" + id + "]";
}
	
	
	
}
