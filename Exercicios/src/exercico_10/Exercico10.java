package exercico_10;
/*
 * 
 * 10) Implemente um programa que receba um número inteiro do teclado e imprima se o número é
par ou ímpar.*/

import java.util.Scanner;
public class Exercico10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int number = scanner.nextInt();
		scanner.close();
		if (number % 2 == 0)
		System.out.printf("%d é par", number);
		if (number % 2 == 1)
		System.out.printf("%d é ímpar", number);

	}

}
