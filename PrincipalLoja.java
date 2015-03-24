package java3;
import java.util.Scanner;
import java.util.ArrayList; 

public class PrincipalLoja {

	private Scanner teclado = new Scanner(System.in);	
	private ArrayList<Veiculo> Store = new ArrayList<Veiculo>(); 
	
	public static void main(String[] args) {
		PrincipalLoja obj = new PrincipalLoja(); 
		obj.MenuPrincipal(); 
		}
	void MenuPrincipal(){ 
		boolean loop = true;
		while(loop){
		System.out.println("------------------"); 
		System.out.println("1-Cadastrar Moto");
		System.out.println("2-Cadastrar Carro"); 
		System.out.println("3-Pesquisar Moto");
		System.out.println("4-Pesquisar Carro");
		System.out.println("5-Buscar moto por chassi");
		System.out.println("6-Buscar carro por chassi");
		System.out.println("7-Listar estoque de moto");
		System.out.println("8-Listar estoque de carro");
		System.out.println("9-Listar Todos os veiculos");
		System.out.println("10-Sair");
		int op = teclado.nextInt();
		switch(op){ 
		case 1:MenuCadastrar(2);break; 
		case 2:MenuCadastrar(1);break;
		case 3:pesquisaVeiculo(1);break; 
		case 4:pesquisaVeiculo(2);break; 
		case 5:buscaChassi(1);break; 
		case 6:buscaChassi(2);break; 
		case 7:ListaEstoque(1);break; 
		case 8:ListaEstoque(2);break;  
		case 9:raioxEstoque();break;
		case 10:System.exit(0);break; 
		default: System.out.println("Opcao invalida"); 
			}
		}
	}
	void MenuCadastrar(int type){ 
		boolean loop = true;
		while(loop){
		System.out.println("------------------"); 
		System.out.println("Informe o chassi:");
		String chassi = teclado.next(); 
		System.out.println("Informe a montadora:"); 
		String montadora = teclado.next(); 
		System.out.println("Informe o modelo:");
		String modelo = teclado.next(); 
		System.out.println("Informe o tipo:");
		String tipo = teclado.next();
		System.out.println("Informe a cor");
		String cor = teclado.next(); 
		System.out.println("Informe o preco:");
		Double preco = teclado.nextDouble();
			if(type == 1) { 
				Store.add(new Carro(chassi,montadora,modelo,tipo,cor,preco));
				System.out.println("Carro cadastrado com sucesso!!!");
				loop = false; 
			}else{ 
				Store.add(new Moto(chassi,montadora,modelo,tipo,cor,preco)); 
				System.out.println("Moto cadastrada com sucesso!!!");
				loop = false;
			}	
		}
	}
	void ListaEstoque(int opcao){
		String tpVeiculo=null;
		if(opcao==1){ 
			for(Veiculo aux : Store){
				if(aux instanceof Moto){exibe(aux,"MOTO");}
			}
		}else{
			for(Veiculo aux : Store){
				if(aux instanceof Carro){exibe(aux,"CARRO");}
			}
		}
	}
	void exibe(Veiculo aux, String tipoVeiculo){ 
		System.out.println("------------------");
		System.out.println(" " + tipoVeiculo); 
		System.out.println("------------------");
		System.out.println("Chassi: 		" 	+ aux.getChassi());
		System.out.println("Montadora: 		" 	+ aux.getMontadora());
		System.out.println("Modelo: 		" 	+ aux.getModelo());
		System.out.println("Tipo: 			" 	+ aux.getTipo());
		System.out.println("Cor: 			"	+ aux.getCor());
		System.out.println("Preco: 			" 	+ aux.getPreco());
		aux.imprimir();
	}
	void raioxEstoque(){
		String tpVeiculo=null; 
		for(Veiculo aux : Store){
		if(aux instanceof Moto){tpVeiculo="MOTO";}
		if(aux instanceof Carro){tpVeiculo="CARRO";}
		exibe(aux,tpVeiculo);
		}
	}
	void buscaChassi(int opcao){
		String tpVeiculo=null;
		int counter=0;
		System.out.println("Informe o chassi:");
		String chassi = teclado.next();
		if(opcao==1){ 
		for(Veiculo aux: Store){ 
			if(aux instanceof Moto){
				tpVeiculo="MOTO";
				if(aux.getChassi().equals(chassi)){ 
				exibe(aux,tpVeiculo);
				counter++; 
				}
			}
		}
		}else{
		for(Veiculo aux: Store){
			if(aux instanceof Carro){ 
				tpVeiculo="CARRO";
				if(aux.getChassi().equals(chassi)){ 
				exibe(aux,tpVeiculo);
				}
			}
		}
		}
		
		if(counter==0){System.out.println("Chassi %s" + chassi + "nao encontrado!!!");}
	}
	void pesquisaVeiculo(int opcao){ 
		String tpVeiculo=null;
		int counter=0;
		System.out.println("Informe um atributo:");
		String atrib = teclado.next();
		if(opcao==1){ 
			for(Veiculo aux : Store){ 
				tpVeiculo="MOTO";
				if(buscaAtributo(aux,atrib,tpVeiculo)){exibe(aux,tpVeiculo);counter++;}	
			}
		}else{ 
			for(Veiculo aux : Store){ 
				tpVeiculo="CARRO";
				if(buscaAtributo(aux,atrib,tpVeiculo)){exibe(aux,tpVeiculo);counter++;}	
			}
		}
		
		if(counter==0){System.out.println("Nenhum veiculo possui o atributo pesquisado");}
	}
	public boolean buscaAtributo(Veiculo aux,String atrib,String tpVeiculo){
		boolean achei=false;
		if(aux.getChassi().equals(atrib)){achei=true;}
		if(aux.getChassi().equals(atrib)){achei=true;}
		if(aux.getModelo().equals(atrib)){achei=true;}
		if(aux.getTipo().equals(atrib)){achei=true;}
		if(aux.getCor().equals(atrib)){achei=true;}	
		return achei;
	}
}
