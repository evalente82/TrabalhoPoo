package pedidos;

public enum StatusPedido {
ANALISE("Analise"),
REPROVADO("Reprovado"),
APROVADO("Aprovado"),
ATENDIDO("Atendido");

	private String descricao;
	
	StatusPedido(String descricao) {
	// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
