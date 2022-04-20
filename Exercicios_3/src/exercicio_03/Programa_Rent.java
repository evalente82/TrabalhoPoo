package exercicio_03;


import java.text.ParseException;
import java.util.Scanner;
import exercicio_03.Rent;
public class Programa_Rent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
		System.out.println();
		System.out.println("Rent #" + i + ":");
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Room: ");
		int room = sc.nextInt();
		vect[room] = new Rent(name, email);//colocou o numero que escolhi como indice no 
		//vect[rom], depois chamou o metodo construtor e prencheu com nome e email
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
		if (vect[i] != null) {
		System.out.println(i + ": " + vect[i]);
		}
		}
		sc.close();
		}
	}