import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int valores[] = new int[10];
        //ler valores
        for(int i=0; i<10; i++){
            System.out.println( i + " Digite um número ");
            valores[i] = sc.nextInt();
        }
        //exibir valores
        for(int j=0; j<10; j++){
            System.out.println(" * " +valores[j]);
        }
        System.out.println("/nDigite o valor mínimo ");
         int minimo = sc.nextInt();
        System.out.println("Digite o valor máximo ");
        int maximo = sc.nextInt();
        System.out.println("Valores dentro do intervalo ");
        for(int x=0; x<10; x++){
            if(valores[x] >= minimo && valores[x] <= maximo){
                System.out.println(" * " + valores[x]);

            }

        }


       sc.close();
    }
}
