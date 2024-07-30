public class MetodoRetorno {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int sm = soma(9,3);
        System.out.print("A soma vale "+ sm);
    }
}

