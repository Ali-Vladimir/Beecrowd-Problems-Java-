import java.util.Scanner;

public class p1036 {
    public static void main(String[] args) {
        selection_test_1 object = new selection_test_1();
        object.m_read();
    }
}

class selection_test_1 {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextFloat(), a_teclado.nextFloat(), a_teclado.nextFloat());
    }
    void m_calculate(float p_A,float p_B,float p_C) {
        float v_delta=(float)(Math.pow(p_B, 2.0)-4*p_A*p_C);
        if(v_delta<0 || p_A==0) {
            m_print(false, 0, 0);
        } else {
            float v_R1=(float)((-p_B+Math.sqrt(v_delta))/(2*p_A));
            float v_R2=(float)((-p_B-Math.sqrt(v_delta))/(2*p_A));
            m_print(true, v_R1, v_R2);
        }
    }

    void m_print(boolean p_condition, float p_R1, float p_R2) {
        if(p_condition) {
            System.out.printf("R1 = %.5f%n", p_R1);
            System.out.printf("R2 = %.5f%n", p_R2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
