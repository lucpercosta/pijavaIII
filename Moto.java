package java3;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Moto extends Veiculo implements Serializable {
	private int cilindrada; 
	private int capTanque;
	private Scanner teclado = new Scanner(System.in); 
	private static final long serialVersionUID = 1L;
	private transient double limitefixo = 1000.0;
	private transient int qdadadeCadastrada;
	
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
	public void gravar(){ 
		try{ 
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
			new FileOutputStream("Motos.data")));
			out.writeInt(getQdadadeCadastrada()+1);
			setQdadadeCadastrada(getQdadadeCadastrada()+1); 
			out.writeObject(this);
			out.close();
		}catch(IOException e){
			System.out.println("Problemas com IO Exception"); 
		}
	}
	public void setQdadadeCadastrada(int qdadadeCadastrada) {
		this.qdadadeCadastrada = qdadadeCadastrada;
	}
	public int getQdadadeCadastrada() {
		return qdadadeCadastrada;
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