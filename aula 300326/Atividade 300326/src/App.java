
    import java.util.Scanner;
    import java.util.Calendar;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Ler dados para instanciar a classe Pessoa
        System.out.println("Digite o nome da Pessoa");
        String n = sc.next();

        //sc.next(); //Limpa o buffer
        System.out.println("Digite o CPF: ");
        String cpf = sc.next();

        Pessoa p1 = new Pessoa(n, cpf); //Utiliza construtor de 2 parametros
        //Leitura de datas com Calendar
        Calendar data =  Calendar.getInstance();
        data.set(2000, 2, 7); //YEAR, MONTH, DATE

        p1.setNascimento(data);
        System.out.println(p1.toString());

        sc.close();

    }
}
