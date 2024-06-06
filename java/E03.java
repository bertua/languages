/*Um canal de notícias internacionais, previa temperatura máxima para Brasília de 85
graus Farenheit. Escrever um programa que lhe permita converter esta temperatura
(e qualquer outra) para graus Celsius, sabendo que a relação entre elas é C=(F–32)*5/9. */
import java.util.Scanner;
public class E03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Temperatura em farenheit: ");
        double F = input.nextDouble();
        input.nextLine();
        double C= (F-32)*(5/9);
        System.out.println("Temperatura em celsius: " + C);


    }
}