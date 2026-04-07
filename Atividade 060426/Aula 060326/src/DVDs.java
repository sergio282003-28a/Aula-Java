public class DVDs extends Produto{

private int duracao;

 public DVDs (String nome, double preco, int duracao, String codigoBarras){
    super(nome, preco, codigoBarras);
    this.duracao = duracao;
    }

    public int getDuracao (){return this.duracao;}
    public void setDuracao(int duracao){this.duracao = duracao;}

    public String toString(){
        return "Nome do DVD: "+getNome()+
        " Preço: "+getPreco()+
        " Duração: "+this.duracao;
    }
 }

