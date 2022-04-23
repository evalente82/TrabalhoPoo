package pedidos;

public class Item {
	
	private int sequencial;
	private int qtd;	
	Produto produto;

	public Item(int sequencial, int qtd, Produto produto ) {
		
		this.sequencial = sequencial;
		this.qtd = qtd;
		this.produto = produto;
	}

	public int getSequencial() {
		return sequencial;
		}
	
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial; 
	}
	
	public int getQtd() {
		return qtd;
		}
	
	public void setQtd(int qtd) {
		this.qtd = qtd; 
	}
	
	public Produto getProduto() {
		return  produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		
		return "Sequencial: "+ this.sequencial + ", Quantidade: " + this.qtd + ", Produto: " + this.produto;
	}

}
