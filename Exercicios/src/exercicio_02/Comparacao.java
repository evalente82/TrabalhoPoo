package exercicio_02;
/*
 2) Implemente a Classe Comparacao que receba dois n�meros inteiros do teclado e apresente se eles
s�o iguais, se algum � maior ou menor do que o outro.
 */

import java.util.Scanner;
public class Comparacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int number1 = scanner.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int number2 = scanner.nextInt();
		scanner.close();
		if (number1 == number2)
		System.out.println("Esse n�meros s�o iguais");
		if (number1 > number2)
		System.out.printf("%d � maior do que %d", number1, number2);//faltava codigo
		if (number1 < number2)
		System.out.printf("%d � maior do que %d ", number2, number1);//faltava codigo

	}

}
