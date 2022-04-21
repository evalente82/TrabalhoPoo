package pedidos;

public class Cliente {
	
	private String CPF;
	private String nome;
	private String endereco;

	public Cliente(String CPF, String nome, String endereco) {
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
		}
	
	public Cliente(String CPF, String nome) {
		this.CPF = CPF;
		this.nome = nome;
		}
	
	public String getCPF() {
		return CPF;
		}
	
	public void setCPF(String CPF) {
		this.CPF = CPF; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco; 
	}
	@Override
	public String toString() {
		
		return "CPF: "+ this.CPF + ", Nome: " + this.nome +
				", Endereço: " + this.endereco;
	}
	
}
