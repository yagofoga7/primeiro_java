package atividades;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {

	//Variáveis
	double horatraba, valorhora, salabruto, salaliqu, inss;

	//Instanciar classe Scanner
	Scanner ler = new Scanner(System.in);

	//Entrada de dados
	
	
	System.out.println("Quantas horas você trabalhou? ");
	horatraba = ler.nextDouble();

	System.out.println("Qaunto vale sua hora trabalhada:");
	valorhora = ler.nextDouble();

	//Processamento
	salabruto = valorhora + horatraba;
	inss = salabruto * 0.12;
	salaliqu = salabruto - inss;

	//Saída de dados
	System.out.print("Você do seu salário bruto é  " + salabruto + ",");
	System.out.print("Seu salário liquido é  " + salaliqu +".");

}
}
