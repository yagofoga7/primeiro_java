package atividades;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		//Variáveis
		String n, i;
		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe seu nome:");
		n = ler.next();
		
		System.out.println("Informe sua idade:");
		i = ler.next();
		
		//Saída de dados
		System.out.print("Você se chama " + n);
		System.out.print("Sua idade é  " + i);
		

	}

}
