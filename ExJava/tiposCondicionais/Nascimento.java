package tiposCondicionais;

import java.util.Scanner;

public class Nascimento {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nasc = scanner.nextInt();
		
		int idade = 2024 - nasc; 
		
	if (idade > 18 ) {
		System.out.println("maior");
	} else {
		System.out.println("menor");
	}
	scanner.close();
	}
}
