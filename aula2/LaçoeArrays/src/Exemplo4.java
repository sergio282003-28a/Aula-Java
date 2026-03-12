public class Exemplo4 {
    public static void main(String[] args) throws Exception {
    String names[] = {"Joao", "Bia", "Pedro", "Joao"};
 String procura = "Joao";
 int cont = 0;
 for (int i = 0; i < names.length; i++) {
 if(!names[i].equals(procura)){
 continue;
 }
 cont++;
 System.out.println("Encontrei");
 }
 System.out.println(cont+" "+procura+" na lista");
    }
    
}
