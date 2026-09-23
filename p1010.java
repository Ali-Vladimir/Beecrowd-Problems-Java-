import java.util.Scanner;

public class p1010{
    public static void main(String[] args) {
        Salary object=new Salary();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",object.salary());
    }
}
class Salary{
    Scanner a_teclado=new Scanner(System.in);
    double salary(){
	a_teclado.nextInt();
	double v_suma = a_teclado.nextInt() * a_teclado.nextDouble();
	a_teclado.nextInt();
	return v_suma + a_teclado.nextInt() * a_teclado.nextDouble();
    }
}
