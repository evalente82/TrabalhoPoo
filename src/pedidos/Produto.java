package pedidos;

public class Produto {
	
	private String codigo;
	private String nome;
	private double preco;
	//private double qtdEstoque;
	private int qtdEstoq;

	public Produto(String codigo, String nome, double preco, int qtdEstoq) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		//this.qtdEstoque = qtdEstoque;
		this.qtdEstoq = qtdEstoq;
	}
	
	public String getCodigo() {
		return codigo;
		}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo; 
	}
	
	public String getNome() {
		return nome;
		}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public double getPreco() {
		return preco;
		}
	
	public void setPreco(double preco) {
		this.preco = preco; 
	}
	
	public int getQtdEstoq() {
		return qtdEstoq;
		}
	
	public void setQtdEstoq(int qtdEstoq) {
		this.qtdEstoq = qtdEstoq; 
	}
	
	public void adicionaQtdEstoque(int qtdEstoq) {
		this.qtdEstoq += qtdEstoq;
		}
	
	public void diminuiQtdEstoque(int qtdEstoq) {
		this.qtdEstoq -= qtdEstoq;
		}
	
	@Override
	public String toString() {
		
		return "Código: "+ this.codigo + ", Nome: " + this.nome +
				", Preço: " + this.preco + ", qtdEstoque: " + this.qtdEstoq;
	}
}
