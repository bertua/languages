/*Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a
seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
Escrever o menor elemento do vetor e a respectiva posição dele nesse vetor. */

import java.util.ArrayList;
import java.util.Scanner;

public class E11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            System.out.print("Numero: ");
            int numero = input.nextInt();
            input.nextLine();
            vetor.add(numero);
        }

        int maior = vetor.get(0);
        int menor = vetor.get(0);
        int posicaoMa = vetor.indexOf(maior);
        int posicaoMe = vetor.indexOf(menor);

        for (int i = 0; i < vetor.size(); i++) {

            if (vetor.get(i) > maior) {
                maior = vetor.get(i);
                posicaoMa = vetor.indexOf(maior);
            }

            if (vetor.get(i) < menor) {
                menor = vetor.get(i);
                posicaoMe = vetor.indexOf(menor);
            }

        }

        System.out.println("Maior: " + maior + ", Posição: " + posicaoMa);
        System.out.println("Menor: " + menor + ", Posição: " + posicaoMe);

    }
}
