public class Conta {

  private double saldo;
  private String nome;
  private  int numero;
  private double limite;


  //Escreva os getters e setters de todos os atributos
  public void setNome(String nome){
    if (nome != null && nome.length() > 1) {
        this.nome = nome;
    }
    
  }

  
  public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    // GETTERS

    public String getNome(){     
    return this.nome;
    }
    

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getLimite(){
        return this.limite;
    }





  /*public void saque(double valor){

    if(saldo >= valor && valor > 0){

      this.saldo -= valor;

      System.out.println("Saque feito com sucesso!");

      System.out.println("====================================");

    }else{

      System.out.println("Saldo insuficiente ou valor de saque inválido");

    }

    System.out.println("Seu saldo atual é: " + this.saldo);

  }*/

  boolean sacarVerifica(double quantidade){

    if (quantidade > this.saldo && quantidade <= 0) {
          return false;

    }else{

          double novoSaldo = this.saldo - quantidade;
          this.saldo = novoSaldo;

      return true;

    }

  }

  public String toString(){
     return "Nome: " + this.nome + " | Num.: " + this.numero + " | Saldo: " + this.saldo + " | Limite: " + this.limite; 
  }



  public double deposito(double dep){
    
    this.saldo += dep;

    return saldo;

  }

}
