package java3;

public abstract class Veiculo {

	protected String chassi; 
	protected String montadora; 
	protected String modelo; 
	protected String tipo; 
	protected String cor; 
	protected Double preco;
	
	public Veiculo(){ 	
	}
	public Veiculo(String chassi,String montadora,String modelo,String tipo,
			String cor,Double preco){
		this.chassi = chassi; 
		this.montadora  = montadora; 
		this.modelo = modelo; 
		this.tipo = tipo;
		this.cor = cor; 
		this.preco = preco; 
	}
	//Metodo abstrato obrigatorio para classes herdeiras
	public abstract void imprimir();
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getChassi() {
		return chassi;
	}
	public String getMontadora() {
		return montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public String getCor() {
		return cor;
	}
	public Double getPreco() {
		return preco;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	

	
	
}
