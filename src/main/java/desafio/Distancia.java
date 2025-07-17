package desafio;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Distancia {

    public static void distancia(int x){
        int result = x * 2;
        System.out.printf("%d minutos\n", result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int usuario = Integer.parseInt(br.readLine());
        Distancia.distancia(usuario);
    }

}