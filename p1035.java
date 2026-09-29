import java.util.Scanner;

public class p1035 {
    public static void main(String[] args) {
        selection_test_1 object = new selection_test_1();
        object.m_read();
    }
}

class selection_test_1 {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextInt(), a_teclado.nextInt(), a_teclado.nextInt(), a_teclado.nextInt());
    }
    void m_calculate(int p_A,int p_B,int p_C,int p_D) {
	m_print(p_B>p_C && p_D>p_A && (p_C+p_D)>(p_A+p_B) && p_C>=0 && p_D>=0 && p_A%2==0);	
}
    void m_print(boolean p_condition) {
        if(p_condition) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
