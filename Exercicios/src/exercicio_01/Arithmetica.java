package exercicio_01;
/*
1) Implemente a Classe Arithmetica que receba dois n�meros inteiros do teclado e apresente a sua
soma, multiplica��o, subtra��o e divis�o.
*/

import java.util.Scanner;
public class Arithmetica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int sum, sub, div, mul;
		System.out.print("Digite o primeiro n�mero: ");
		number1 = input.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		number2 = input.nextInt();
		input.close();
		sum = number1 + number2;
		mul = number1 * number2;
		sub = number1 - number2;
		div = number1 / number2;
		System.out.printf("A soma � %d%n", sum);
		System.out.printf("O produto � %d%n", mul);
		System.out.printf("A diferen�a � %d%n", sub);
		System.out.printf("A divis�o � %d%n", div);

	}

}
