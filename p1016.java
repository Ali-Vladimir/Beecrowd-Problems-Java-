import java.util.Scanner;

public class p1016 {
    public static void main(String[] args) {
        distance object = new distance();
        object.m_read();
    }
}

class distance {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_print(m_calculate(a_teclado.nextInt()));
    }
    int m_calculate(int p_distance) {
        return p_distance*2;
    }
    void m_print(int p_result) {
        System.out.println(p_result+" minutos");
    }
}
