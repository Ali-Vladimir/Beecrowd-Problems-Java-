import java.util.Scanner;

public class p1009{
    public static void main(String[] args) {
        Salary object=new Salary();
        System.out.printf("TOTAL = R$ %.2f\n",object.salary());
    }
}
class Salary{
    Scanner a_teclado=new Scanner(System.in);
    double salary(){
        a_teclado.nextLine();
        return a_teclado.nextDouble()+a_teclado.nextDouble()*0.15;
    }
}