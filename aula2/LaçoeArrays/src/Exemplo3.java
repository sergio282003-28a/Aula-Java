public class Exemplo3 {
    public static void main(String[] args) throws Exception {
    String nomes[] = {"Joao", "Maria","Jose"};

   String procura = "Joao";
 boolean encontrou = false;
 for(int i = 0; i<nomes.length; i++){
 if(nomes[i].equals(procura)){
 encontrou = true;
 break;
 }
 System.out.println("Visitamos este lugar");
 }
 if(encontrou)
 System.out.println(procura + " encontrado!");
    else
 System.out.println(procura + "NAO encontrado");
    }   
}
