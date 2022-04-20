
/*1) Fazer um programa para ler um número inteiro n e a altura de n pessoas. Armazene as n alturas
em um vetor. Em seguida, mostrar a altura média das pessoas.
*/
package exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a qtd de pessoas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite uma altura: ");
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
		sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("A média da altura é: %.2f%n", avg);
		sc.close();
		}
}