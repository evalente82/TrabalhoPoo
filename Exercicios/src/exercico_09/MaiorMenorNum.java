package exercico_09;
/*
 * 9) Implemente a Classe MaiorMenorNum que receba três números inteiros do teclado e mostre a
soma, o produto, a média , o maior e o menor número entre eles.
 * */
import java.util.Scanner;
public class MaiorMenorNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro inteiro: ");
		int number1 = input.nextInt();
		System.out.print("Digite o segundo inteiro: ");
		int number2 = input.nextInt();
		System.out.print("Digite o terceiro inteiro: ");
		int number3 = input.nextInt();
		input.close();
		int sum = number1 + number2 + number3;
		int average = sum / 3;
		int product = number1 * number2 * number3;
		int largest = number1;
		if (number2 > largest)
		largest = number2;
		if (number3 > largest)
		largest = number3;
		int smallest = number1;
		if (number2 < smallest)
		smallest = number2;
		if (number3 < smallest)
		smallest = number3;
		
		System.out.printf("A Soma é %d%n", sum);
		System.out.printf("A Média é %d%n", average);
		System.out.printf("O Produto é %d%n", product);
		System.out.printf("O Maior é %d%n", largest);
		System.out.printf("O Menor é %d%n", smallest);

	}

}
