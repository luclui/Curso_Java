package tiposPrimitivos;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in)) {
			System.out.print("Digite seu nome ");
			String nome = teclado.nextLine();
			System.out.print("Digite a nota ");
			float nota  = teclado.nextFloat();
			
System.out.println("Sua nota é " + nota);
System.out.printf("A nota de %s é %.2f \n", nome, nota );
		}
	}
	}
