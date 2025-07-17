package desafio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoRaio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final double PI = 3.14159;
        int r = Integer.parseInt(br.readLine());
        double v = (4.0 / 3) * PI * r * r * r;
        System.out.printf("VOLUME = %.3f%n", v);
    }
}
