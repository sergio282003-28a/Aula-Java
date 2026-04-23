public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n ---- Polimorfismo com Animais ----");
        Animal animais[] = new Animal[10];

        Animal doguinho = new Animal("Caramelo",4,0.2,0);
        Peixe peixe = new Peixe("Lambari",0,0.2,0,0);
        Anfibio anfibio = new Anfibio ("Sapo Cururu",4,0.8,0);
        Peixe peixe2 = new Peixe("Tilápia",0,0.3,0,0);
        Passaro passaro = new Passaro ("Rio",2,1,0);

        //Asspciar objeto a posição do array
        animais[0] = doguinho;
        //Utilizando objeto do um array
        animais[0].mover();
        animais[0].setNome("Novo nome");

        animais [1] = new Peixe ("Nemo",2,0.8,0,1);
        animais [1].mover();

        animais [2] = new Anfibio ("Sapinho",2,0.3,0);
        animais [2].mover();

        animais [3] = new Passaro ("Rio",2,1.5,0);
        animais [3].mover();
        


        
        }
    
}
