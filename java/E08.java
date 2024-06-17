/*A prefeitura de Aparecida de Goiânia abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. */
import java.util.Scanner;
public class E08 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Salario bruto: ");
        double salarioBruto = input.nextDouble();

        System.out.print("Prestação: ");
        double prestacao = input.nextDouble();

        if (prestacao <= salarioBruto * 0.3) {
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Empréstimo negado");
        }
    }
}
