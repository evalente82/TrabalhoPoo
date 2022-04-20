package exercicio_05;
/*
 * 5) Sabendo que a conversão de temparatura da escala de Celsius para Fahrenheit é dada pela
fórmula °F = (9 x °C) / 5 + 32, implemente um programa que imprima essa conversão, quando o
usuário digitar a temperatura em Celsius e mostre a temperatura em Fahrenheit. Esse programa deverá
implementar o laço do... while, caso o usuário queira continuar digitando outras temperaturas.
 * */
import java.util.Locale;
import java.util.Scanner;
public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
		System.out.print("Digite a temperatura em Celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();

	}

}
