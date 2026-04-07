public class Livro extends Produto{

    private String autor;

    public Livro(String nome, double preco, String autor, String codigoBarras){
        super (nome, preco, codigoBarras);
        this.autor = autor;
    }

    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    public String toString(){
        return "Nome do Livro: "+ getNome() +" Preço: "+ getPreco() +"Autor: "+ this.autor;
    }
}
