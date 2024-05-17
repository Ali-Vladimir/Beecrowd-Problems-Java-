import java.util.Scanner;

public class p1002 {
    public static void main(String[] args) {
        Area_of_a_Circle a=new Area_of_a_Circle();
        String result = String.format("%.4f",a.m_econtrarArea());
        System.out.println("A="+result);
    }
}
class Area_of_a_Circle{
    Scanner a_teclado=new Scanner(System.in);
    double m_econtrarArea(){
        double v_R=a_teclado.nextDouble();
        return v_R*v_R*3.14159;
    }
}