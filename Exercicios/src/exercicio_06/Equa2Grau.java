package exercicio_06;
/*
 * 6) Sabendo que uma equação do segundo grau pode ser definida como ax2+ bx + c = 0, faça um
programa que receba do teclado os valores a, b e c e calcule as raízes dessa equação.
 * */

import java.util.Scanner;
public class Equa2Grau {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner in = new Scanner (System.in);
		System.out.println("Entre com o elemento a:");
		a = in.nextInt();
		System.out.println("Entre com o elemento b:");
		b = in.nextInt();
		System.out.println("Entre com o elemento c:");
		c = in.nextInt();
		double delta = Math.pow(b,2)- 4* a *c;
		System.out.println(delta);
		double x1 = (- b + Math.sqrt(delta))/2*a;
		double x2 = (- b - Math.sqrt(delta))/2*a;
		System.out.println(x1);
		System.out.println(x2);
		in.close();

	}

}
