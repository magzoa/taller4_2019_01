package py.edu.facitec.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class ItemPedido extends General{

	
private int cantidadProducto;
private BigDecimal subTotal;

@ManyToOne
private Pedido pedido;

@ManyToOne
private Producto producto;

public int getCantidadProducto() {
	return cantidadProducto;
}

public void setCantidadProducto(int cantidadProducto) {
	this.cantidadProducto = cantidadProducto;
}

public BigDecimal getSubTotal() {
	return subTotal;
}

public void setSubTotal(BigDecimal subTotal) {
	this.subTotal = subTotal;
}

public Pedido getPedido() {
	return pedido;
}

public void setPedido(Pedido pedido) {
	this.pedido = pedido;
}
	
	
	
}
