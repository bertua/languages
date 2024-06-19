/*Escreva um algoritmo que procure por um determinado elemento em um vetor e
imprima quantas vezes ele aparece no vetor (caso ele esteja no vetor). Seu
algoritmo deve, inicialmente, ler os valores e armazená-los em um vetor de 16
posições. */

import java.util.ArrayList;
import java.util.Scanner;

public class E12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for (int i = 0; i < 16; i++) {
            System.out.print("Numero: ");
            int numero = input.nextInt();
            input.nextLine();
            vetor.add(numero);
        }

        System.out.print("Elemento: ");
        int numero = input.nextInt();
        input.nextLine();
        int elemento = numero;
        int cont = 0;
        for (int i = 0; i < vetor.size(); i++) {
            if (elemento == vetor.get(i)) {
                cont++;
            }
        }

        System.out.print("Elemento: " + elemento + ", Total de vezess: " + cont);
    }
}
