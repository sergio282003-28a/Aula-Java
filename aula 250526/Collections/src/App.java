import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        FileReader fl = new FileReader("src/cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fl);
        String line = null;
        br.readLine(); //descarta linha 1   
        while((line = br.readLine()) != null){
            String dados[] = line.split(","); //quebra linha a cada virgula
            Pessoa p = new Pessoa (dados[0], dados[1], dados[2]);
            pessoas.add(p);
        }
        br.close();

        System.out.println(pessoas.size()+ " Pessoas cadastradas no sistema! ");

        //Escrita em arquivo
        Pessoa p2 = new Pessoa ("Odete da Silva", "203.550.795-28", "23/01/1980");
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cadastro_pessoas.csv", true));

        bw.newLine();
        bw.write(p2.escreveObjetoCsv());
        bw.close();
        }
    }


