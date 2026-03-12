import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); //Inicia o leitor

        System.out.println( "DIgite um número: "); //Exibe mensagem
        int numero = input.nextInt(); // Lê do teclado
        System.out.println("Você digitou o número "+ numero +"!!"); //exibe 

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();

        int soma = numero + numero2;
        System.out.println("O resultado da soma é: "+ soma);

        input.close(); //fecha o leitor
    }
}

