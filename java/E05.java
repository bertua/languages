/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do
valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor. */
import java.util.Scanner;
public class E05 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Salario: ");
        double salario = input.nextDouble();
        input.nextLine();

        System.out.print("Comissão: ");
        double comissao = input.nextDouble();
        input.nextLine();

        double comissao5por;
        double salarioFinal = 0;
        int carrosVendidos = 0;

        while(true) {
            System.out.print("Valor carro: ");
            double valorCarro = input.nextDouble();
            input.nextLine();
            if (valorCarro < 0) {
                break;
            }

            carrosVendidos++;
            comissao5por = valorCarro * 0.05;

            salarioFinal += comissao5por + comissao;
            
        }

        salarioFinal += salario;
        System.out.println("Carros vendidos: " + carrosVendidos);
        System.out.println("salarioFinal: " + salarioFinal);

    }
}