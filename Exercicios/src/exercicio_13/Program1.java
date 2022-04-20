package exercicio_13;
/*
 * 12) Implemente o Program1 com o método main, que instancie com o construtor padrão um objeto
da Classe Product. Posteriormente, receba os atributos públicos name, price e quantity do teclado.
Adicione uma quantidade através do método addProducts(quantity) e mostre a quantidade atualizada.
Remova uma quantidade através do método removeProducts(quantity) e mostre a quantidade
atualizada.
 * */

import java.util.Locale;
import java.util.Scanner;
import exercicio_12.Product;
public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();

	}

}
