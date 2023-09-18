package Execução;
import java.util.Scanner;

public class Aplicação {
	
	public static void linha() {
		int i;
	    
		for (i=1; i<=80; i++)
			System.out.print("_");
	}
	public static void cabecalho() {
		linha();
		String uni = "Universidade Católica de Pernambuco";
		System.out.format("Universidade Católica de Pernambuco\n", uni);
		System.out.print("Bibioteca Central\n");
		linha();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cabecalho();
	}

}
