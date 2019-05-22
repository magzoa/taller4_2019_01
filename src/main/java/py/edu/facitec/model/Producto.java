package py.edu.facitec.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Producto extends General {

private String descripcion;
private Date fechaVencimiento;
private BigDecimal precio;
private Integer cantidad;

@OneToMany(mappedBy="producto")
private List<ItemPedido> itemPedidos;

public Producto() {
	
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Date getFechaVencimiento() {
	return fechaVencimiento;
}

public void setFechaVencimiento(Date fechaVencimiento) {
	this.fechaVencimiento = fechaVencimiento;
}

public BigDecimal getPrecio() {
	return precio;
}

public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}

public Integer getCantidad() {
	return cantidad;
}

public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
}

public List<ItemPedido> getItemPedidos() {
	return itemPedidos;
}

public void setItemPedidos(List<ItemPedido> itemPedidos) {
	this.itemPedidos = itemPedidos;
}







	
	
	
	
	
	
}
