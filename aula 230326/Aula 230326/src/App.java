import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- SISTEMA BANCÁRIO ---- \n");
        //Declarando instanciando um objeto da classe Conta
        Conta conta1 = new Conta(); 
        //Editando atributos do objeto

        System.out.println("Digite o nome do cliente: ");
        conta1.nome = sc.nextLine(); //lendo o nome do teclado

        System.out.println("Digite o saldo do cliente: ");
        conta1.saldo = sc.nextDouble();

        System.out.println("Digite o limete do cliente: ");
        conta1.limite = sc.nextDouble();

        System.out.println("Digite o número da conta do cliente: ");
        conta1.numero = sc.nextInt();

        System.out.println("---- SAQUE ----");
        System.out.println("Digite o valor de saque: ");
        double valor = sc.nextDouble();
        if(conta1.sacarVerifica(valor) == true){
            System.out.println("Saque realizado com sucesso! ");
        }
        System.out.println(conta1.toString());
        sc.close();

    }
}
