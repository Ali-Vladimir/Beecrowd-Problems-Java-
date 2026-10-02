import java.util.Scanner;

public class p1072 {
    public static void main(String[] args) {
        intervaltwo object = new intervaltwo();
        object.m_read();
    }
}

class intervaltwo {
    Scanner a_teclado = new Scanner(System.in);
    int a_in = 0, a_out = 0;
    void m_read() {
        int v_cant = a_teclado.nextInt(), v_aux = 0;
        for (int i = 0; i < v_cant; i++) {
            m_count(a_teclado.nextInt());
        }
        m_write();
    }

    void m_count(int p_number) {
        if (p_number >= 10 && p_number <= 20) {
            a_in++;
        } else {
            a_out++;
        }
    }

    void m_write() {
        System.out.println(a_in + " in");
        System.out.println(a_out + " out");
    }
}