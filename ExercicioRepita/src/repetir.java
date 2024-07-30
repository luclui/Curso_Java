import javax.swing.JOptionPane;
public class repetir {

    public static void main(String[] args) {
        int n, s  = 0 , acCem = 0, media, total = 0;
        double p = 0, i = 0;
        do {
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor: <br> (Valor 0 interrompe)</html>"));
                s += n;

                if (n % 2 == 0){p++;}
                    else i++;

                if (n > 100) {acCem++;}

                total++;

                media = s/total;


        }while(n != 0);

        JOptionPane.showMessageDialog(null, "<html>Resultado final:<hr>" + "<br>" +
                "Somatório vale: "+ s +
                "<br> Números pares: "+ p +
                "<br> Números ímpares: "+ i +
                "<br> Números maiores que 100: "+ acCem +
                "<br> Média dos números: "+ media +"</html>");
    }
}
