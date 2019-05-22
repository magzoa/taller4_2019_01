package py.edu.facitec.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido extends General {

private Date fechaToma;
private Date fechaEntrega;
private BigDecimal total;

//Aplicar la relación de muchos a uno
@ManyToOne 
private Cliente cliente;//asociación

@OneToMany(mappedBy="pedido")
private List<ItemPedido> itemPedidos;



//opcional
public Pedido() {
//	cliente=new Cliente();composición
}

public Date getFechaToma() {
	return fechaToma;
}

public void setFechaToma(Date fechaToma) {
	this.fechaToma = fechaToma;
}

public Date getFechaEntrega() {
	return fechaEntrega;
}

public void setFechaEntrega(Date fechaEntrega) {
	this.fechaEntrega = fechaEntrega;
}

public BigDecimal getTotal() {
	return total;
}

public void setTotal(BigDecimal total) {
	this.total = total;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}





	
	
	
}
