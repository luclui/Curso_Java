import java.util.Arrays;

public class VetorForIt {
    public static void main(String[] args) {
        double[] v ={3.5, 9.3, 4, -4.75};
        Arrays.sort(v);//coloca o vetor em ordem
            for (double valor:v) System.out.print(valor+ " ");
    }
}
