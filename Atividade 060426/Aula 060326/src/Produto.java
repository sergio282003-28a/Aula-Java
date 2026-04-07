public class Produto {
    private String nome;
    private double preco;
    private String codigoBarras;


    //Construtor
    public Produto(String nome, double preco, String codigoBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;

    }

    public Produto(){}

    

    //GET e SET

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco (){return this.preco;}
    public void setPreco (double preco){this.preco = preco;}

    public String getcodigoBarras(){return this.codigoBarras;}
    public void setCodigoBarras (String codigoBarras){this.codigoBarras = codigoBarras;}

    public String toString(){
        return "Nome: "+nome+" Preço: "+preco+"Código de Barras: "+codigoBarras;
    }

}
