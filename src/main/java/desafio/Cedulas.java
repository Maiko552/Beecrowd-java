package desafio;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class Cedulas {

    public static void RestoDoDinheiro(BigDecimal valorEmReais) {
        List<BigDecimal> notas = List.of(
                BigDecimal.valueOf(100),
                BigDecimal.valueOf(50),
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(10),
                BigDecimal.valueOf(5),
                BigDecimal.valueOf(2),
                BigDecimal.valueOf(1)
        );

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        symbols.setDecimalSeparator(',');
        DecimalFormat formatador = new DecimalFormat("###,##0.00", symbols);

        System.out.println(valorEmReais);

        for (BigDecimal nota : notas) {
            BigDecimal[] resultado = valorEmReais.divideAndRemainder(nota);
            BigDecimal quantidade = resultado[0];
            BigDecimal resto = resultado[1];

            if (quantidade.compareTo(BigDecimal.ZERO) > 0) {
                String notaFormatada = formatador.format(nota);
                System.out.println(quantidade.intValue() + " nota(s) de R$ " + notaFormatada);
            }else{
                String notaFormatada = formatador.format(nota);
                System.out.println(quantidade.intValue() + " nota(s) de R$ " + notaFormatada);
            }

            valorEmReais = resto.setScale(2, RoundingMode.DOWN);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal valor = new BigDecimal(br.readLine());
        RestoDoDinheiro(valor);
    }
}
