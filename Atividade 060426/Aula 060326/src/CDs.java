public class CDs extends Produto{

    private int numeroFaixas;

    public CDs(String nome, double preco, int numeroFaixas, String codigoBarras){
        this.numeroFaixas = numeroFaixas;
        super (nome , preco, codigoBarras);
        
        
    }

    public int getnumeroFaixas(){return this.numeroFaixas;}
    public void setnumeroFaixas(int numeroFaixas){this.numeroFaixas = numeroFaixas;}

    public String toString(){
        return "Nome do CD: "+ getNome() + " Preço: "+getPreco()+ " Numero de Faixas: "+ this.numeroFaixas;
    }

}
