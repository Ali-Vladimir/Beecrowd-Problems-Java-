import java.util.Scanner;

public class p1006{
    public static void main(String[] args) {
        Media_2 object=new Media_2();
        System.out.printf("MEDIA = %.1f\n",object.media());
    }
}
class Media_2{
    Scanner a_teclado=new Scanner(System.in);
    double media(){
        return (a_teclado.nextDouble()*2+a_teclado.nextDouble()*3+a_teclado.nextDouble()*5)/10;
    }
}