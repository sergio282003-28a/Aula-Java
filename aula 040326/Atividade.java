public class Atividade{
        public static void main(String[] args){
            
            int i = 10;
            int j = 2;
            int x = 0;
            int y = 0;
            j++;
            ++i;
            x = i++ + j;
            y = ++j + ++i;

            System.out.println("Soma de X " + x);
            System.out.println("Soma de Y " + y);
            System.out.println("Soma de J " + j);
            System.out.println("Soma de I " + i);
        }       
    }