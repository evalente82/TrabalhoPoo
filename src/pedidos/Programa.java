package pedidos;

import java.io.ObjectInputFilter.Status;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import pedidos.Cliente;


public class Programa {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira 2 clientes ! \n");
		int n = 2;
		int z = 3;
		Cliente cliente = new Cliente("10008648719","endrigo");
		Cliente[] clientes = new Cliente[n];//instaciando um vetor do tipo clientes e o seu tamanho = 2
		Produto[] produtos = new Produto[z];
		Pedido[] pedidos = new Pedido[n];
		
		
		for (int i=0; i<clientes.length; i++) {
			sc.nextLine();
			System.out.print(" Insira o nome do cliente \n");
			String nome = sc.nextLine();
			System.out.print(" Insira o CPF do cliente \n");
			String CPF = sc.nextLine();
			System.out.print(" Insira o endereço do cliente \n");
			String endereco = sc.nextLine();			
			clientes[i] = new Cliente(CPF, nome, endereco);//
			
			}//ele joga para o indice do vetor o nome o CPF e o endereço
		
		for(int i =0; i<clientes.length; i++) {
			System.out.print(" Cliente: ");
			
			System.out.print(clientes[i] + "\n ");
		}
		
		
		System.out.print("Insira 3 Produtos! \n");
		for (int i=0; i<produtos.length; i++) {
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
		
		for(int i =0; i<produtos.length; i++) {
			System.out.print(" Produto: ");
			
			System.out.print(produtos[i] + "\n ");
		}
		System.out.print(" \n");
		
		
		
		System.out.print("Insira 2 Pedidos! \n");
		for (int i=0; i<pedidos.length; i++) {
			sc.nextLine();
			
			System.out.print(" Insira o Número do pedido \n");
			String numero = sc.nextLine();
			
			System.out.print(" \n");
			
			System.out.print(" Insira a data do pedido \n");
			String data = sc.nextLine();
			
			System.out.print(" \n");
			
			System.out.print(" Insira o valor do pedido \n");
			double valor = sc.nextDouble();
			
			System.out.print(" \n");
			
			//System.out.print(" Insira o cliente  \n");
			cliente.setNome(clientes[0].getNome());
			
			//cliente.setNome(clientes[i].getNome());
			
			//System.out.print(" Insira a situação \n");
			StatusPedido situacao = StatusPedido.ANALISE;
			
			//String numero, String data, double valor, Cliente cliente, StatusPedido situacao)
			pedidos[i] = new Pedido(numero, data, valor, cliente, situacao);//
			System.out.print(" \n\n");
			
			}//ele joga para o indice do vetor o nome o CPF e o endereço
		
		for(int i =0; i<pedidos.length; i++) {
			System.out.print(" Pedido: ");
			
			System.out.print(pedidos[i] + "\n ");
		}
		sc.close();
		
		
	}

}
