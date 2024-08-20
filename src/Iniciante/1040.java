package Iniciante;

import java.util.Scanner;

public class a1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        float media = (a * 2 + b * 3 + c * 4 + d) / 10;
        float exame = 0, media2;
        String mm = String.format("%.1f", media);
        System.out.println("Media: " + mm);
        if (media >= 5 && media <= 6.9) {
            exame = input.nextFloat();

        }
        if (media >= 7) {

            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            media2 = (media + exame) / 2;
            System.out.println("Nota o exame:" + exame);

            if (media2 >= 5) {
                System.out.println("Aluno aprovado.");
                String me2 = String.format("%.1f", media2);
                System.out.println("Media final: " + me2);
            } else if (media2 < 5) {
                System.out.println("Aluno reprovado.");
                String me3 = String.format("%.1f", media2);
                System.out.println("Media final: " + me3);
            }

        }

        input.close();
    }
}
