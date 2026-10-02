import java.util.Scanner;

public class p1072 {
    public static void main(String[] args) {
        even_square object = new even_square();
        object.m_read();
    }
}

class even_square {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextInt());
    }

    void m_calculate(int p_number) {
        for (int i = 2; i <= p_number; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }
    }
}