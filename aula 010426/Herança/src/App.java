public class App {
    public static void main(String[] args) throws Exception {
        Animal cavalo = new Animal ("Pé de pano", 1);
        cavalo.setPeso(0.5f);
        cavalo.andar();
        System.out.println(cavalo.toString());

        Ave passaro = new Ave("Pica-Pau", 2);
        passaro.setPeso(0.5f);
        passaro.andar();
        System.out.println(passaro.toString());
    }
}
