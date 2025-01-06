import java.util.Scanner;

public class p1004{
    public static void main(String[] args) {
        Simple_Product object=new Simple_Product();
        System.out.println("PROD = "+object.product());
    }
}
class Simple_Product{
    Scanner a_teclado=new Scanner(System.in);
    int product(){
        return a_teclado.nextInt()*a_teclado.nextInt();
    }
}