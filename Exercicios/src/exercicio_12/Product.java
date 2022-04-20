package exercicio_12;
/*
 * 11) Implemente a Classe Product no pacote entities que receba os atributos públicos name, price e
quantity do teclado. Implemente também os métodos totalValueInStock() que retorne o preço vezes
a quantidade, addProducts(int quantity) que acumule a quantidade passada como parâmetro para a
quantidade existente, removeProducts(int quantity) que diminua a quantidade passada como
parâmetro para a quantidade existente e, por fim, o método toString().
 * */
public class Product {
	public String name;
	public double price;
	public int quantity;
	public double totalValueInStock() {
	return price * quantity;
	}
	public void addProducts(int quantity) {
	this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
	this.quantity -= quantity;
	}
	public String toString() {
	return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
