package pedidos;
import java.util.ArrayList;

public class Pedido {
	
	private String numero;
	private String data;
	private double valor = 0;
	StatusPedido situacao;
	Cliente cliente;
	private ArrayList<Item> listaItem = new ArrayList<Item>();

	public Pedido(String numero, String data, Cliente cliente, StatusPedido situacao) {
		
		this.numero = numero;
		this.data = data;
		this.cliente = cliente;	
		this.situacao = situacao;
	}
	
	public String getNumero() {
		return numero;
		}
	
	public void setNumero(String numero) {
		this.numero = numero; 
	}
	
	public String getData() {
		return data;
		}
	
	public void setData(String data) {
		this.data = data; 
	}
	
	public double getValor() {
		return valor;
		}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente  = cliente; 
	}

	public void adicionaListaItem(Item item){
		this.listaItem.add(item);
		this.valor += item.produto.getPreco() * item.getQtd();		
	}
	
	public void visualizarItens() {
		this.listaItem.forEach(item -> {
			System.out.println(item);
		});
	}
		
	@Override
	public String toString() {
		
		return "Número: "+ this.numero + ", Data: " + this.data +
				", Valor: " + this.valor + ", Cliente: " + this.cliente + "Situação: " + this.situacao;
	}

}
