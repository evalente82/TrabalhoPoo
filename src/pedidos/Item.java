package pedidos;

public class Item {
	
	private int sequencial;
	private double qtd;
	Pedido pedido;
	Produto produto;

	public Item(int sequencial, double qtd, Pedido pedido, Produto produto ) {
		
		this.sequencial = sequencial;
		this.qtd = qtd;
	}
	
	public int getSequencial() {
		return sequencial;
		}
	
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial; 
	}
	
	public double getQtd() {
		return qtd;
		}
	
	public void setQtd(double qtd) {
		this.qtd = qtd; 
	}
	
	public Pedido getPedido() {
		return  pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public Produto getProduto() {
		return  produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	@Override
	public String toString() {
		
		return "Sequencial: "+ this.sequencial + ", Quantidade: " + this.qtd +
				", Pedido: " + this.pedido + ", Produto: " + this.produto;
	}

}
