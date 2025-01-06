import java.util.Scanner;

public class p1008{
    public static void main(String[] args) {
        Salary object=new Salary();
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",object.number(),object.salary());
    }
}
class Salary{
    Scanner a_teclado=new Scanner(System.in);
    int number(){
        return a_teclado.nextInt();
    }
    int hours(){
        return a_teclado.nextInt();
    }
    double value(){
        return a_teclado.nextDouble();
    }
    double salary(){
        return hours()*value();
    }
}