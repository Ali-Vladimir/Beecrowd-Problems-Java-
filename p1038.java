import java.util.Scanner;

public class p1038 {
    public static void main(String[] args) {
        bocadillo object = new bocadillo();
        object.m_read();
    }
}

class bocadillo {
    void m_read() {
        Scanner a_teclado = new Scanner(System.in);
        m_print(m_calculate(a_teclado.nextInt(), a_teclado.nextInt()));
    }

    void m_print(float p_total) {
        System.out.printf("Total: R$ %.2f%n", p_total);
    }

    float m_calculate(int p_code, int p_quantity) {
        float v_total = 0;
        switch (p_code) {
            case 1:
                v_total = p_quantity * 4.00f;
                break;
            case 2:
                v_total = p_quantity * 4.50f;
                break;
            case 3:
                v_total = p_quantity * 5.00f;
                break;
            case 4:
                v_total = p_quantity * 2.00f;
                break;
            case 5:
                v_total = p_quantity * 1.50f;
                break;
        }
        return v_total;
    }
}