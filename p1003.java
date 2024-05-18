import java.util.Scanner;

public class p1003{
    public static void main(String[] args) {
        Simple_Sum object=new Simple_Sum();
        System.out.println("SOMA = "+object.suma());
    }
}
class Simple_Sum{
    Scanner a_teclado=new Scanner(System.in);
    int suma(){
        return a_teclado.nextInt()+a_teclado.nextInt();
    }
}