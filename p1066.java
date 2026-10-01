import java.util.Scanner;

public class p1066 {
    public static void main(String[] args) {
        even_odd_postive_negative object = new even_odd_postive_negative();
        object.m_read();
    }
}
class even_odd_postive_negative {
    int a_even=0, a_odd=0, a_positive=0, a_negative=0;
    Scanner a_teclado = new Scanner(System.in);
    void m_analyze(int p_number) {
        if(p_number%2==0) {
            a_even++;
        } else {
            a_odd++;
        }
        if(p_number>0) {
            a_positive++;
        } else if(p_number<0) {
            a_negative++;
        }
    }
    void m_read() {
        for(int i=0; i<5; i++) {
            m_analyze(a_teclado.nextInt());
        }
        m_print(a_even, a_odd, a_positive, a_negative);
    }
    void m_print(int p_even, int p_odd, int p_positive, int p_negative) {
        System.out.println(p_even + " valor(es) par(es)");
        System.out.println(p_odd + " valor(es) impar(es)");
        System.out.println(p_positive + " valor(es) positivo(s)");
        System.out.println(p_negative + " valor(es) negativo(s)");
    }
}