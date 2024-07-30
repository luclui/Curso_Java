import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int num , soma = 0;
        String resp;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            num = scan.nextInt();
            soma+= num ; // soma = soma+ num;
            System.out.print("Quer continuar? [S/N] ");
            resp = scan.next();
        }while (resp.equals("S"));
        System.out.println("A soma de todos valores é " + soma);
    }
}
