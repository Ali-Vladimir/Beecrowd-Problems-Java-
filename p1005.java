import java.util.Scanner;

public class p1005{
    public static void main(String[] args) {
        Media_1 object=new Media_1();
        System.out.printf("MEDIA = %.5f\n",object.media());
    }
}
class Media_1{
    Scanner a_teclado=new Scanner(System.in);
    double media(){
        return (a_teclado.nextDouble()*3.5+a_teclado.nextDouble()*7.5)/11;
    }
}