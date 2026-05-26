public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Pessoa(){}

    public Pessoa (String nome, String cpf, String dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {return nome;}

    public String getCpf() {return cpf;}

    public String getDataNascimento() {return dataNascimento;}

    public void setNome(String nome) {this.nome = nome;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}

    @Override
    public String toString(){
        return "Nome: "+nome + "\n"+
        "CPF: "+cpf + "\n"+
        "Data de Nascimento: "+dataNascimento;
    }

    
    public int compareTo(Pessoa outra){
        return this.nome.compareTo(outra.nome);
    }
    public String escreveObjetoCsv(){
        return this.nome + ","+ this.cpf + ","+ this.dataNascimento + "\n";
    }

}






