public class Passaro extends Animal {
    public Passaro (String nome, int patas, double velocidade,int localizacao){
        super(nome,patas,velocidade,localizacao);
    }
    public Passaro(){}

    @Override
    public void mover(){
        System.out.println( "Passaro "+getNome()+" movendo-se ^^ v ^^ v ^^ -->");
        super.setLocalizacao(1);
    }
    @Override
    public String toString(){
        return "Ave [Nome: "+getNome()+
        "|| Patas: "+getPatas()+
        "|| Velocidade: "+getVelocidade()+
        "|| Localização: "+getLocalizacao()+
        "]";

    }
}
