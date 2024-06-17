/*Em uma danceteria o preço da entrada sofre variações. Segunda, Terça e Quinta (2,
3 e 5), ela oferece um desconto de 25% do preço normal de entrada. Nos dias de
músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao preço
normal da entrada. Fazer um programa que leia o preço normal da entrada, o dia da
semana (1 a 7) e se é dia de música ao vivo (1) ou não (2). Calcular e imprimir o
preço final que deverá ser pago pela entrada. */
import java.util.Scanner;

public class E09 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Preço entrada: ");
        double entrada = input.nextDouble();

        System.out.print("Dia da semana: ");
        int dia = input.nextInt();
        input.nextLine();

        System.out.print("Música ao vivo: ");
        int vivo = input.nextInt();
        input.nextLine();

        if (dia != 4 && dia !=6) {
            entrada -= entrada * 0.25;
        }

        if (vivo == 1) {
            entrada += entrada * 0.15;
        }

        System.out.println("Valor entrada: " + entrada);
    }
}
