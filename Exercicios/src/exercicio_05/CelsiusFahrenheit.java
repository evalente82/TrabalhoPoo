package exercicio_05;
/*
 * 5) Sabendo que a convers�o de temparatura da escala de Celsius para Fahrenheit � dada pela
f�rmula �F = (9 x �C) / 5 + 32, implemente um programa que imprima essa convers�o, quando o
usu�rio digitar a temperatura em Celsius e mostre a temperatura em Fahrenheit. Esse programa dever�
implementar o la�o do... while, caso o usu�rio queira continuar digitando outras temperaturas.
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
