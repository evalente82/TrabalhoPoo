package exercicio_01;
/*
1) Implemente a Classe Arithmetica que receba dois números inteiros do teclado e apresente a sua
soma, multiplicação, subtração e divisão.
*/

import java.util.Scanner;
public class Arithmetica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum, sub, div, mul;
		System.out.print("Digite o primeiro número: ");
		number1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		number2 = input.nextInt();
		input.close();
		sum = number1 + number2;
		mul = number1 * number2;
		sub = number1 - number2;
		div = number1 / number2;
		System.out.printf("A soma é %d%n", sum);
		System.out.printf("O produto é %d%n", mul);
		System.out.printf("A diferença é %d%n", sub);
		System.out.printf("A divisão é %d%n", div);

	}

}
