import java.util.Scanner;

public class p1014 {
    public static void main(String[] args) {
        consumption object = new consumption();
        object.m_read();
    }
}

class consumption {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_print(m_average(a_teclado.nextInt(),a_teclado.nextFloat()));
    }
    float m_average(int p_distance, float p_fuel) {
        return p_distance/p_fuel;
    }
    void m_print(float p_result) {
        System.out.printf("%.3f km/l\n",p_result);
    }
}
