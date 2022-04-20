package exercicio_04;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio_04 {

	public static void main(String[] args) {
		List<String> batata = new ArrayList<>();
		batata.add("Maria");
		batata.add("Alex");
		batata.add("Bob");
		batata.add("Anna");
		batata.add(2, "Marco");
		
		System.out.println(batata.size());
		
		for (String x : batata) {//foreache
		System.out.println(x); //mostra a lista
		}
		
		System.out.println("---------------------");
		
		batata.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : batata) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + batata.indexOf("Bob"));
		System.out.println("Index of Marco: " + batata.indexOf("Marco"));
		System.out.println("---------------------");

		List<String> result = batata.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
		System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = batata.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		}
	}