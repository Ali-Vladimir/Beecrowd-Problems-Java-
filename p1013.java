import java.util.Scanner;

public class p1013 {
    public static void main(String[] args) {
        the_greatest object = new the_greatest();
        object.m_read(); 
    }
}

class the_greatest {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_print(m_mayor(m_mayor(a_teclado.nextInt(), a_teclado.nextInt()), a_teclado.nextInt()));
    }
    int m_mayor(int p_first, int p_second) {
        return (p_first + p_second + Math.abs(p_first - p_second)) / 2;
    }
    void m_print(int p_result) {
        System.out.printf("%d eh o maior\n", p_result);
    }
}
