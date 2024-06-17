/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo
Positivo', senão escrever a mensagem 'Saldo Negativo'. */
import java.util.Scanner;

public class E07 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = input.nextInt();
        input.nextLine();
        
        System.out.print("Saldo: ");
        double saldo = input.nextDouble();

        System.out.print("Débito: ");
        double debito = input.nextDouble();

        System.out.print("Crédito: ");
        double credito = input.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println(saldoAtual);
        if (saldoAtual >= 0) {
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo negativo");
        }

    }
}