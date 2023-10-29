package com.mycompany.relogio;

import java.util.Scanner;

public class Relogio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----------RELÓGIO----------\n");
        System.out.print("Digite a Hora Atual: ");
        int horas = scanner.nextInt();

        System.out.print("Digite os Minutos Atuais: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os Segundos Atuais: ");
        int segundos = scanner.nextInt();

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }

            if (horas == 24) {
                horas = 0;
            }

            String horaFormatada = String.format("%02d:%02d:%02d", horas, minutos, segundos);
            System.out.println("\nA Hora Atual é -> " + horaFormatada);
        }
    }
}
