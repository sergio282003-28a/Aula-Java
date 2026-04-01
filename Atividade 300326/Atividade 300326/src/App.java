import java.util.Scanner;
/*Crie também uma outra classe, que possui um método principal e que
instancie um objeto da classe criada, e que realiza as operações
disponibilizadas pelo objeto*/


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int option;        
        Calculadora calc = new Calculadora();

        do{

            System.out.println("--- Calculadora --- \n"+"1 - soma\n"+"2 - subtraçao\n"+ "3 - multiplicação\n"+"4 - divisão\n "+ "5 - Sair \n -----------");

            option = sc.nextInt();
            if(option != 5){
            System.out.println("Digite um valor inteiro");
            calc.setValor1(sc.nextInt());
            
             System.out.println("Digite um outro valor inteiro");
            calc.setValor2(sc.nextInt());
            }
            switch (option) {
                case 1:
                    System.out.println(calc.getValor1() + "+" + calc.getValor2() + " = " + "\n" + calc.soma());
                    System.out.println("O resultado da soma é: "+calc.soma());
                    
                    break;

                     case 2:
                    System.out.println(calc.getValor1()+"+"+calc.getValor2() + "=" + "\n"+calc.soma());
                    System.out.println("O resultado da soma é: "+calc.subtracao());
                    
                    break;

                     case 3:
                    System.out.println(calc.getValor1()+"+"+calc.getValor2() + "=" + "\n"+calc.soma());
                    System.out.println("O resultado da soma é: "+calc.multiplicacao());
                    
                    break;

                     case 4:
                    System.out.println(calc.getValor1()+"+"+calc.getValor2() + "=" + "\n"+calc.soma());
                    System.out.println("O resultado da soma é: "+calc.divisao());
                    
                    break;
            
                default:
                    System.out.println("Opção Invalida! ");
                    break;
            }
        }while(option != 5);
        sc.close();
    }
}
