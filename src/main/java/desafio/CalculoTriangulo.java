package desafio;

import java.io.*;
import java.util.*;

public class CalculoTriangulo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        final double PI = 3.14159;

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * C * C;
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        out.printf("CIRCULO: %.3f%n", areaCirculo);
        out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        out.printf("QUADRADO: %.3f%n", areaQuadrado);
        out.printf("RETANGULO: %.3f%n", areaRetangulo);

        out.flush();
    }
}
