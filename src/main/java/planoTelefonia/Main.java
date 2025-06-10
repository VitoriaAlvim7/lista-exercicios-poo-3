package planoTelefonia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        Plano plano = new Plano(minutos);
        double valor = plano.calcularValor();

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        sc.close();
    }
}
