import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        Scanner sc = new Scanner(System.in); //leitor do teclado
        System.out.println("Digite um número entre 1 e 12");
        int digitado = sc.nextInt();
        
        //exiba a qual mês o número digitado se refere (somente de 1 a 12)

        if (digitado < 1 || digitado > 12) {
            System.out.println("Número não permido!!!");
            
        }else{
        System.out.println("O mês de "+meses[digitado-1] + " está na posição 0. ");
        }

        sc.close(); //Sempre no final do código
    }
}
