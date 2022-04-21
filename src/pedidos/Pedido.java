package pedidos;
import java.util.List;
import java.util.ArrayList;

public class Pedido {
	
	private String numero;
	private String data;
	private double valor;
	StatusPedido situacao;
	Cliente cliente;

	public Pedido(String numero, String data, double valor, Cliente cliente, StatusPedido situacao) {
		
		this.numero = numero;
		this.data = data;
		this.valor = valor;
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
	
	public void setValor(double valor) {
		this.valor = valor; 
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente  = cliente; 
	}
	
	public List<Item> getListaItem() {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(null);
		return items;
		}
	
	public void adicionaListaItem(Item item){
		
		
	}
	
	
	@Override
	public String toString() {
		
		return "Número: "+ this.numero + ", Data: " + this.data +
				", Valor: " + this.valor + ", Cliente: " + this.cliente + "Situação: " + this.situacao;
	}

}
