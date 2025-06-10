package medidorGlicose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o valor da glicose: ");
        float valorGlicose = sc.nextFloat();

        MedidorGlicose medidor = new MedidorGlicose(valorGlicose);

        String classificacao = medidor.classificarGlicose();

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
