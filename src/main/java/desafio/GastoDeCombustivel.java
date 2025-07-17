package desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GastoDeCombustivel {

    public static void gastoCombustivel(int tempo, int velocidade){
        double distancia = tempo * velocidade;
        double gastoDeCombustivel = distancia / 12;
        System.out.printf("%.3f\n", gastoDeCombustivel);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tempo = Integer.parseInt(br.readLine());
        int velocidade = Integer.parseInt(br.readLine());

        GastoDeCombustivel.gastoCombustivel(tempo, velocidade);
    }
}
