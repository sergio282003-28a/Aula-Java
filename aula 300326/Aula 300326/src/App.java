public class App {
    public static void main(String[] args) throws Exception { 
        //Utilizando construtor Cheio
       Carro car = new Carro("Gol", "preto", "AAA3E34", 2);
       System.out.println(car.toString());
       
       //Utilizando construtor VAZIO
       Carro car2 = new Carro(); 
    }
}
