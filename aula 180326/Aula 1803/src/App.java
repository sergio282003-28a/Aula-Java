public class App {
    public static void main(String[] args) throws Exception {
        Conta minhaConta; //declaração
        minhaConta = new Conta();
        minhaConta.nome = "Sergio";

        //executar o metodo saque
        minhaConta.saque(100);


        Conta minhaConta2 = new Conta();
        minhaConta2.nome = "sergio";
        minhaConta2.saldo = 1000.9;
        minhaConta2.numero = 28;
        minhaConta2.saque(100);






    }
}
