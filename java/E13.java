/*Faça um algoritmo para ler dois vetores V1 e V2 de 15 números cada. Calcular e
escrever a quantidade de vezes que V1 e V2 possuem os mesmos números e nas
mesmas posições. */

import java.util.ArrayList;
import java.util.Scanner;

public class E13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> v1 = new ArrayList<Integer>();
        ArrayList<Integer> v2 = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++) {
            System.out.print("Numero v1: ");
            int numero = input.nextInt();
            input.nextLine();
            v1.add(numero);
        }

        for (int i = 0; i < 15; i++) {
            System.out.print("Numero v2: ");
            int numero = input.nextInt();
            input.nextLine();
            v2.add(numero);
        }

        for (int i = 0; i < v1.size(); i++) {
            for (int j = 0; j < 1; j++) {
                if (v1.get(i) == v2.get(i) && v1.indexOf(v1.get(i)) == v2.indexOf(v2.get(i))) {
                    System.out.println("Número: " + v1.get(i) + ", Posição: " + v1.indexOf(v1.get(i)) );
                }
            }
        }

    }
}
