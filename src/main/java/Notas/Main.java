package Notas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        Aluno aluno = new Aluno(nota1, nota2);
        float notaFinal = aluno.notaFinal();
        if (notaFinal <= 60) {
            System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
            System.out.println("REPROVADO");
        } else {
            System.out.printf("Aprovado com nota %.1f%n", notaFinal);
        }
        sc.close();
    }
}
