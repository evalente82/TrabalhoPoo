package pedidos;

import java.util.Locale;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira 2 clientes ! \n");
		int n = 2;
		int z = 3;
		int i = 0;
		
		Cliente[] vetClientes = new Cliente[n];
		Produto[] produtos = new Produto[z];
		Pedido[] pedidos = new Pedido[n];
		
		//cliente
		for (i=0; i<vetClientes.length; i++) {
			sc.nextLine();
			System.out.print(" Insira o nome do cliente \n");
			String nome = sc.nextLine();
			System.out.print(" Insira o CPF do cliente \n");
			String CPF = sc.nextLine();
			System.out.print(" Insira o endereço do cliente \n");
			String endereco = sc.nextLine();			
			vetClientes[i] = new Cliente(CPF, nome, endereco);//
			
			}
		
		for( i =0; i<vetClientes.length; i++) {
			System.out.print(" Cliente: ");
			
			System.out.print(vetClientes[i] + "\n ");
		}
				
		//produto
		System.out.print("Insira 3 Produtos! \n");
		for ( i=0; i<produtos.length; i++) {
			sc.nextLine();
			
			System.out.print(" Insira o Código do produto \n");
			String codigo = sc.nextLine();
			
			System.out.print(" \n");
			
			System.out.print(" Insira o Nome do produto \n");
			String nome = sc.nextLine();
			
			System.out.print(" \n");
			
			System.out.print(" Insira o Peço do produto \n");
			double preco = sc.nextDouble();
			
			System.out.print(" \n");
			
			System.out.print(" Insira a qtd em estoque \n");
			int qtdEstoq = sc.nextInt();
			
			produtos[i] = new Produto(codigo, nome, preco, qtdEstoq);//
			System.out.print(" \n\n");
			
			}//ele joga para o indice do vetor o nome o CPF e o endereço
		
		for( i =0; i<produtos.length; i++) {
			System.out.print(" Produto: ");
			
			System.out.print(produtos[i] + "\n ");
		}
		System.out.print(" \n");
				
		//pedido
		System.out.print("Insira 2 Pedidos! \n");
		for ( i=0; i<pedidos.length; i++) {
			sc.nextLine();
			
			System.out.print(" Insira o Número do pedido \n");
			String numero = sc.nextLine();
			
			System.out.print(" \n");
			
			System.out.print(" Insira a data do pedido \n");
			String data = sc.nextLine();
			
			System.out.print(" \n");			
			
			System.out.print(" \n");
			
			Cliente cliente = vetClientes[i];
			StatusPedido situacao = StatusPedido.ANALISE;
			
			pedidos[i] = new Pedido(numero, data, cliente, situacao);
			System.out.print(" \n\n");
			
			}		
		
		pedidos[0].adicionaListaItem(new Item(1,3, produtos[0]));// adicionando intens no pedido -- sequencial, qtd do produto x
		pedidos[0].adicionaListaItem(new Item(2,2, produtos[1]));
		pedidos[0].situacao = StatusPedido.APROVADO;// muda para o estado de aprovado
		
		pedidos[1].adicionaListaItem(new Item(1,1, produtos[1]));
		pedidos[1].adicionaListaItem(new Item(2,3, produtos[2]));
		pedidos[1].situacao = StatusPedido.ATENDIDO;
		
		for( i =0; i<pedidos.length; i++) { //exibe os pedidos
			System.out.print(" Pedido: ");
			
			System.out.print(pedidos[i] + "\n ");
		}
		System.out.println();
		pedidos[0].visualizarItens();// imprime os itens de cada pedido
		pedidos[1].visualizarItens();
		
		sc.close();
	}

}
