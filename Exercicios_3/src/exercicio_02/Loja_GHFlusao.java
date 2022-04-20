
/*
 * 2) Loja GHFlus�o
Fazer um programa para ler um n�mero inteiro n e os dados (nome e pre�o) desses n Produtos da

Loja GHFlus�o. Armazene os n produtos em um vetor. Em seguida, mostre o pre�o m�dio dos pro-
dutos.
 */

package exercicio_02;

import java.util.Locale;
import java.util.Scanner;
import exercicio_02.Produto;


public class Loja_GHFlusao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos existem na Loja GHFlus�o? ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];//instaciando um vetor do tipo produto e o seu tamanho
		
		for (int i=0; i<vect.length; i++) {
		sc.nextLine();
		System.out.print("Insira o nome do produto ");
		String name = sc.nextLine();
		System.out.print("Insira o pre�os do produto ");
		double price = sc.nextDouble();
		vect[i] = new Produto(name, price);//
		}//ele joga para o indice do vetor o nome e o pre�o, vect[0] recebe
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {//percorre o vetor somando o pre�o
		sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("A m�dia de pre�os � = %.2f%n", avg);
		sc.close();
		}
	}