import java.util.Scanner;

public class p1001 {
    public static void main(String[] args) {
        Extremely_Basic a=new Extremely_Basic();
        System.out.println("X = "+a.suma());
    }
}
class Extremely_Basic{
    Scanner a_teclado=new Scanner(System.in);
    int suma(){
        return a_teclado.nextInt()+a_teclado.nextInt();
    }
}