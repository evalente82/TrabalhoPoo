/*3) O pensionato GHFlus�o Campe�o possui dez quartos para alugar para estudantes, sendo esses
quartos identificados pelos n�meros 0 a 9.

Fa�a um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade n re-
presentando o n�mero de estudantes que v�o alugar quartos (n pode ser de 1 a 10). Em seguida, re-
gistre o aluguel dos n estudantes.

Para cada registro de aluguel, informe o nome e email do estudante, bem como qual dos quartos ele
escolheu (de 0 a 9).
Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relat�rio de
todas ocupa��es do pensionato GHFlus�o Campe�o , por ordem de quarto, conforme exemplo.

*/

package exercicio_03;

public class Rent {
	private String name;
	private String email;
	public Rent(String name, String email) {
	this.name = name;
	this.email = email;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String toString() {
	return name + ", " + email;
	}
}