package desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] p1 = new double[2];
        double[] p2 = new double[2];

        String[] entrada1 = br.readLine().split(" ");
        p1[0] = Double.parseDouble(entrada1[0]);
        p1[1] = Double.parseDouble(entrada1[1]);

        String[] entrada2 = br.readLine().split(" ");
        p2[0] = Double.parseDouble(entrada2[0]);
        p2[1] = Double.parseDouble(entrada2[1]);

        double distancia = Math.sqrt(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));

        System.out.printf("%.4f\n", distancia);
    }
}
