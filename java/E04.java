/*Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada
um representa em relação ao total de eleitores. */
import java.util.Scanner;
public class E04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Numeros de eleitores: ");
        int eleitores = input.nextInt();
        input.nextLine();

        System.out.print("Votos validos: ");
        int votosVal = input.nextInt();
        input.nextLine();

        System.out.print("Votos brancos: ");
        int votosBra = input.nextInt();
        input.nextLine();

        System.out.print("Votos nulos: ");
        int votosNul = input.nextInt();
        input.nextLine();

    

        double validosPorc = (double)votosVal/eleitores * 100;
        double brancosPorc = (double)votosBra/eleitores * 100;
        double nulosPorc = (double)votosNul/eleitores * 100;

        System.out.println(eleitores);
        System.out.println(votosVal);
        System.out.println(validosPorc);
        

        System.out.println("Votos validos: " + votosVal + " " + validosPorc + "%, Votos brancos: " + votosBra + " " + brancosPorc + "%, Votos nulos: " + votosNul + " "+ nulosPorc +"%");
    }
}
