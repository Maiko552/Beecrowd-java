package desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Maior {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String linha = reader.readLine().trim();
        String[] partes = linha.split(" ");

        List<Integer> numero = new ArrayList<>();
        for (String parte : partes) {
            numero.add(Integer.valueOf(parte));
        }
        Optional<Integer> maior = numero.stream()
        .max(Integer::compareTo);
        maior.ifPresent(m -> System.out.printf("%d eh o maior", m));

    }

}
