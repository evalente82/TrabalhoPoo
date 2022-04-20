package exercicio_03;
/*
 * 3) Implemente a Classe AreaCircunferencia que imprima a área de uma circunferência de raio 10.
 * */

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 10.0;
		final double PI = 3.14159;
		double area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");

	}

}
