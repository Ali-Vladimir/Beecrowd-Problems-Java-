import java.util.Scanner;

public class p1037 {
    public static void main(String[] args) {
        interval object = new interval();
        object.m_read();
    }
}

class interval {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextFloat());
    }

    void m_calculate(float p_number){
        if(p_number<0 || p_number>100) {
            System.out.println("Fora de intervalo");
        } else if(p_number<=25) {
            System.out.println("Intervalo [0,25]");
        } else if(p_number<=50) {
            System.out.println("Intervalo (25,50]");
        } else if(p_number<=75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}