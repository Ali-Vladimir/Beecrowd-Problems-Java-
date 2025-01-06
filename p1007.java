import java.util.Scanner;

public class p1007{
    public static void main(String[] args) {
        Difference object=new Difference();
        System.out.println("DIFERENCA = "+object.difference());
    }
}
class Difference{
    Scanner a_teclado=new Scanner(System.in);
    int difference(){
        return a_teclado.nextInt()*a_teclado.nextInt()-a_teclado.nextInt()*a_teclado.nextInt();
    }
}