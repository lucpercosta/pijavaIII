package java3;
import java.util.Scanner;

public class Carro extends Veiculo {
	 
	private Double motorizacao; 
	private String cambio;
	private Scanner teclado = new Scanner(System.in); 

	public Carro(){
		
	}
	public Carro(String chassi,String montadora,String modelo,String tipo,
			String cor,Double preco){ 
		super(chassi,montadora,modelo,tipo,cor,preco); 
		Definemotor();
		Definecambio();
	}
	
	public void Definemotor(){ 
		boolean loop = true; 
		while(loop){
			System.out.println("Escolha a motorização:");
			System.out.println("1- 1.0");
			System.out.println("2- 1.6");
			System.out.println("3- 2.0");
			System.out.println("4- 3.5");
			System.out.println("Escolha a opção:");
			int op = teclado.nextInt(); 
			switch (op){ 
			case 1: setMotorizacao(1.0);loop=false;break;
			case 2: setMotorizacao(1.6);loop=false;break;
			case 3: setMotorizacao(2.0);loop=false;break; 
			case 4: setMotorizacao(3.5);loop=false;break; 
			default: System.out.println("Opcao invalida!");
			}
		}
	}
	public void Definecambio(){ 
		boolean loop = true; 
		while(loop){
			System.out.println("Escolha o cambio:");
			System.out.println("1- Manual");
			System.out.println("2- Automatico");
			System.out.println("Escolha a opção:");
			int op = teclado.nextInt(); 
			switch (op){ 
			case 1: setCambio("Manual");loop=false;break;
			case 2: setCambio("Automatico");loop=false;break;
			default:System.out.println("Opcao invalida!");
			}
		}
	}
	
	public void imprimir(){ 
		System.out.println("Motor:			" + getMotorizacao()); 
		System.out.println("Cambio:			" + getCambio());
	}
	public Double getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(Double motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

}
