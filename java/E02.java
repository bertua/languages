/*O critério de notas semestrais numa faculdade consiste em dois bimestres, sendo
que, cada nota varia de 0 a 10 e tem os respectivos pesos 4 e 6. Elabore um
algoritmo que leia as notas bimestrais, calcule e escreva a media semestral. */
import java.util.Scanner;
public class E02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("B1º N1: ");
        double n1 = input.nextDouble();
        input.nextLine();

        System.out.print("B1º N2: ");
        double n2 = input.nextDouble();
        input.nextLine();

        System.out.print("B2º N1: ");
        double n3 = input.nextDouble();
        input.nextLine();

        System.out.print("B2º N2: ");
        double n4 = input.nextDouble();
        input.nextLine();

        double mediaB1 = ((n1 * 4) + (n2 * 6))/10;
        double mediaB2 = ((n3 * 4) + (n4 * 6))/10;
        double mediaS = (mediaB1 + mediaB2)/2;

        System.out.println("Media semestre: " + mediaS);

    }
}
