//Implemente o MENU da Aplicação
/*
1- Cadastrar Animais
2 - Listar Animais
3 - Mover Animal
   -qual animal deseja mover?
4 - Editar Animal
   -qual animal deseja editar
0 - Sair
 */

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {



        

        
        
          Scanner sc = new Scanner (System.in);
      ArrayList<Animal> animaisList = new ArrayList<>();
        String menu = "1 - Cadastrar animais \n" +
                      "2 - Listar animais \n" +
                      "3 - Mover animais \n" +
                      "4 - Editar animais \n" +
                      "0 - Sair";
      int option = 0;
      do{
     
        
      System.out.println(menu);
      option = sc.nextInt();
       

      switch (option){
         case 1:
            System.out.println("Cadastrar Animais");
            System.out.println("Escolha qual animal deseja cadastrar\n"+
               "1 - Animal genérico \n"+
               "2 - Peixe \n"+
               "3 - Ave \n");
               int tipoAnimal = sc.nextInt();
               System.out.println("Digite o nome do Animal: ");
               String nome = sc.next();
               System.out.println("Digite a quantidade de patas do animal: ");
               int patas = sc.nextInt();
               System.out.println("Digite a velocidade do animal: ");
               double velocidade = sc.nextDouble();
               System.out.println("Digite a localização do animal: ");
               int localizacao = sc.nextInt();

               //Especifidades
               switch (tipoAnimal) {
                  case 1:
                     Animal a = new Animal (nome,patas,velocidade,localizacao);
                     animaisList.add(a);
                     System.out.println("Temos "+animaisList.size() +" animais cadastrados");
                     break;

                  case 2:
                     System.out.println("Digite qual tipo de água este peixe vive \n"+"0 - água doce \n1 - água salgada"); 
                     int agua = sc.nextInt();
                     Peixe p = new Peixe (nome,patas,velocidade,localizacao,agua);
                     animaisList.add(p);
                     System.out.println("Temos "+animaisList.size()+ " animais cadastrados!");  
                     break;
                  case 3:
                     Passaro ave = new Passaro(nome,patas,velocidade,localizacao);
                     animaisList.add(ave);
                     System.out.println("Temos "+animaisList.size()+ " animais cadastrados!");  
                     break;
                  
                  default:
                     break;
               }
            break;
            
         case 2: 
         System.out.println( "Listar Animais");
         for(Animal animalItem : animaisList){
            System.out.println(animalItem.toString());

         }
         break;

         case 3:
            System.out.println("Mover Animal");
            for(Animal a : animaisList){
               a.mover();
            }
            //E se quisermos mover apenas 1 ???????
            break;

         case 4:
         System.out.println("Editar Animal");
         break;
         
         case 0:
            System.out.println("Encerrando Menu!");
            break;
      
         default:
            System.out.println("Opção invalido!");
            break;
      }

      
   
    }while(option != 0);
   sc.close();

}
}