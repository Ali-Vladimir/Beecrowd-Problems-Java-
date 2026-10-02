import java.util.Scanner;

public class p1060 {
    public static void main(String[] args) {
        positive_numbers object = new positive_numbers();
        object.m_read();
    }
}
class positive_numbers {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        byte v_aux = 0;
        for (int i = 0; i < 6; i++) {
            if (a_teclado.nextDouble() > 0)
                v_aux++;
        }
        System.out.println(v_aux + " valores positivos");
    }
}