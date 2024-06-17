/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular
com um acréscimo de 50%.Escreva um algoritmo que leia o número de horas
trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas(considere
que o mês possua 4 semanas exatas). */
import java.util.Scanner;

public class E06 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        double horasTrab = input.nextDouble();

        System.out.print("Valor hora: ");
        double valorHora = input.nextDouble();

        double valorHoraEx = valorHora * 1.5;

        double salario;
        double horaEx;
        double salarioHoraEx;

        if (horasTrab > 160) {
            horaEx = horasTrab - 160;
            salarioHoraEx = valorHoraEx * horaEx;
            salario = 160 * valorHora + salarioHoraEx;

        } else {
            salario = horasTrab * valorHora;
        }


        System.out.println("Salario: " + salario);


    }
}
