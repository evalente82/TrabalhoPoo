package exercico_10;
/*
 * 
 * 10) Implemente um programa que receba um n�mero inteiro do teclado e imprima se o n�mero �
par ou �mpar.*/

import java.util.Scanner;
public class Exercico10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int number = scanner.nextInt();
		scanner.close();
		if (number % 2 == 0)
		System.out.printf("%d � par", number);
		if (number % 2 == 1)
		System.out.printf("%d � �mpar", number);

	}

}
