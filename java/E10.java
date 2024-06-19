/*Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram
ou não de um novo produto lançado no mercado. Para isso, forneceu o sexo do
entrevistado e sua resposta (sim ou não). Sabendo-se que foram entrevistadas 10
pessoas, fazer um programa que calcule e escreva: O número de pessoas que
responderam sim O número de pessoas que responderam não A porcentagem de
pessoas do sexo feminino que responderam sim A porcentagem de pessoas do sexo
masculino que responderam não. */
import java.util.Scanner;

public class E10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int s = 0;
        int n = 0;
        int fs = 0;
        int mn = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Sexo (m/f): ");
            String sexo = input.nextLine();

            System.out.print("Aprovação (s/n): ");
            String aprov = input.nextLine();

            if (aprov.equals("s")) {
                s++;
                if (sexo.equals("f")) {
                    fs++;
                }
            } else if (aprov.equals("n")) {
                n++;
                if (sexo.equals("m")) {
                    mn++;
                }
            }
        }

        System.out.println("Total sim: " + s);
        System.out.println("Total não: " + n);
        System.out.println("Feminino sim: " + fs);
        System.out.println("Masculino não: " + mn);
    }
}
