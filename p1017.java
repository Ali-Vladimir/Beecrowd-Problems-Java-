import java.util.Scanner;

public class p1017 {
    public static void main(String[] args) {
        fuel_spent object = new fuel_spent();
        object.m_read();
    }
}

class fuel_spent {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_print(m_calculate(a_teclado.nextFloat(),a_teclado.nextFloat()));
    }
    double m_calculate(float p_hours,float p_speed) {
        return (p_hours*p_speed)/12;
    }
    void m_print(double p_result) {
        System.out.printf("%.3f\n",p_result);
    }
}
