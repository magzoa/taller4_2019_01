package py.edu.facitec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento extends General{

private String descripcion;

//Aplicando la relación de uno a uno
@OneToOne
private Gerente gerente;



@OneToMany(mappedBy="departamento")
private List<Usuario> usuarios;


public Departamento() {
	
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Gerente getGerente() {
	return gerente;
}

public void setGerente(Gerente gerente) {
	this.gerente = gerente;
}

public List<Usuario> getUsuarios() {
	return usuarios;
}

public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
}


	




	
}
