public class VetorMes {

    public static void main(String[] args) {
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < mes.length; i++) System.out.println(mes[i] + " tem " + dias[i] + " dias");
    }
}
