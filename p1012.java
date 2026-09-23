import java.util.Scanner;

public class p1011{
    public static void main(String[] args) {
        Area object=new Area();
	object.m_area();
    }
}
class Area{
    Scanner a_teclado=new Scanner(System.in);
	void m_area(){
        double v_A=a_teclado.nextDouble(),v_B=a_teclado.nextDouble(),v_C=a_teclado.nextDouble();
	double v_tri,v_cir,v_tra,v_qua,v_rec;
	v_tri=(v_A*v_C)/2;
	v_cir=(v_C*v_C)*3.14159;
	v_tra=((v_A+v_B)*v_C)/2;
	v_qua=v_B*v_B;
	v_rec=v_A*v_B;
	m_print(v_tri,v_cir,v_tra,v_qua,v_rec);
	}

	void m_print(double v_tri,double v_cir,double v_tra,double v_qua,double v_rec){
	System.out.printf("TRIANGULO: %.3f\n",v_tri);
	System.out.printf("CIRCULO: %.3f\n",v_cir);
	System.out.printf("TRAPEZIO: %.3f\n",v_tra);
	System.out.printf("QUADRADO: %.3f\n",v_qua);
	System.out.printf("RETANGULO: %.3f\n",v_rec);
	}
}
