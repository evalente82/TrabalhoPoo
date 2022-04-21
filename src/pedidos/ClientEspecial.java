package pedidos;



public class ClientEspecial extends Cliente {	
	
	private String area;
	
	public ClientEspecial(String CPF, String nome, String endereco, String area) {
		super(CPF, nome, endereco);
	}
	
	public String getArea() {
		return area;
		}
	
	public void setArea(String area) {
		this.area = area; 
	}
	
	
	@Override
	public String toString() {
		
		return "Área: "+ this.area;
	}

}
