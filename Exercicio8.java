import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Possui ingresso? (S ou N): ");
        char ingresso = scanner.next().charAt(0);

        if (idade < 18) {
            System.out.println("Entrada não permitida. Menores de 18 anos não podem entrar.");
        } 
        else {

            if (ingresso == 'S' || ingresso == 's') {
                System.out.println("Entrada permitida.");
            } 
            else {
                System.out.println("É necessário adquirir um ingresso.");
            }

        }

        scanner.close();
    }
}