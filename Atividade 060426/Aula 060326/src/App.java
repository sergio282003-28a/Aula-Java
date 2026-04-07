/* Crie uma hierarquia de classes de domínio para uma loja que venda livros,
CDs e DVDs. Sobrescreva o método toString() para que imprima:
• Para livros: nome, preço e autor;
• Para CDs: nome, preço e número de faixas;
• Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no
construtor e no método sobrescrito. Em seguida, crie uma classe Loja com o
método main() que adicione 5 produtos diferentes (a sua escolha) a um vetor
e, por fim, imprima o conteúdo do vetor */


public class App {  
    
    public static void main(String[] args) throws Exception {


       

         Produto produtos[] = new Produto[5];
         produtos[0] = new Livro("Biblia", 49.90, "Deus", "A");
         produtos [1] = new CDs ("Gustavo", 59.90, 5, "B" );
         produtos [2] = new DVDs ("Rei Leão", 79.90,100, "C");
         produtos [3] = new CDs ("Naruto", 100.00, 10, "D" );
         produtos [4] = new DVDs ("Carros", 19.75, 260,"E");

          for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
         
         }
    }
}
    





    

    
    

