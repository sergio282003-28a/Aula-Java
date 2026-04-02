public class Ave extends Animal {
    private String local;
    private boolean migracao;


    public Ave(){
    }
    public Ave (String nome, int recinto){
        super(nome, recinto); //construtor da classe Animal
    }

    
    public String getLocal(){return local;}
    public void setLocal(String local){this.local = local;}

    public boolean isMigracao(){return migracao;}
    public void setMigracao(boolean migracao){this.migracao = migracao;}

    @Override //Sobrescrevi o método da classe mãe

    /*public String toString(){
        return "Ave [Local: "+ local+ 
        "Migração: "+ migracao +
        ", toString() = " + super.toString() + "]";
    }*/

        public void andar(){
          // int novoValor = getRecinto()+2;
          // setRecinto(novoValor);
          System.out.println("Andar de ave");
            setRecinto(getRecinto()+2);
        }

        public String toString(){
            return "Ave [Local = " +local+
            ", migração = " + migracao +
            ", getNome( )"+ getNome() + 
            ", getPeso() " + getPeso() +
            ", getRecinto() "+ getRecinto() + "]";
            
        }
}
