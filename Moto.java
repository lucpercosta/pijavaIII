package java3;
import java.util.Scanner;
import java.io.Serializable;

public class Moto extends Veiculo implements Serializable {
	private int cilindrada; 
	private int capTanque;
	private Scanner teclado = new Scanner(System.in); 
	private static final long serialVersionUID = 5110549514946052395L;
	
	public Moto(){
	}
	public Moto(String chassi,String montadora,String modelo,String tipo,
			String cor,Double preco){ 
		super(chassi,montadora,modelo,tipo,cor,preco); 
		DefineCilindrada();
		DefineTanque();
	}
	public void DefineCilindrada(){ 
		boolean loop = true; 
		while(loop){
			System.out.println("Escolha a cilindrada");
			System.out.println("1- 100");
			System.out.println("2- 150");
			System.out.println("3- 250");
			System.out.println("4- 300");
			System.out.println("5- 500");
			System.out.println("6- 1000");
			System.out.println("Escolha a opção:");
			int op = teclado.nextInt(); 
			switch (op){ 
			case 1: setCilindrada(100);
			case 2: setCilindrada(150);loop=false;break;
			case 3: setCilindrada(250);loop=false;break;
			case 4: setCilindrada(300);loop=false;break;
			case 5: setCilindrada(500);loop=false;break;
			case 6: setCilindrada(1000);loop=false;break;
			default: System.out.println("Opcao invalida!");
			}
		}
	}
	public void DefineTanque(){ 
		boolean loop = true; 
		while(loop){
			System.out.println("Escolha o tamanho do tanque");
			System.out.println("1- 20L");
			System.out.println("2- 25L");
			System.out.println("3- 30L");
			System.out.println("Escolha a opção:");
			int op = teclado.nextInt(); 
			switch (op){ 
			case 1: setCapTanque(20);loop=false;break;
			case 2: setCapTanque(25);loop=false;break;
			case 3: setCapTanque(30);loop=false;break;
			default: System.out.println("Opcao invalida!");
			}		
		}
	}
	public void imprimir(){ 
		System.out.println("Cilindrada:		" + getCilindrada()); 
		System.out.println("Cambio:			" + getCapTanque());
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCapTanque() {
		return capTanque;
	}
	public void setCapTanque(int capTanque) {
		this.capTanque = capTanque;
	}
	
}