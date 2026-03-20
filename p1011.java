import java.util.Scanner;

public class p1011{
    public static void main(String[] args) {
        Sphere object=new Sphere();
        System.out.printf("VOLUME = %.3f\n",object.volume());
    }
}
class Sphere{
    Scanner a_teclado=new Scanner(System.in);
    double volume(){
        return (4.0/3)*3.14159*Math.pow(a_teclado.nextDouble(),3);
    }
}   