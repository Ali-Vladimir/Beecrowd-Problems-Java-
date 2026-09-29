import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {
        banknotes object = new banknotes();
        object.m_read();
    }
}

class banknotes {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextInt());
    }
    void m_calculate(int p_time) {
        int v_100,v_50,v_20,v_10,v_5,v_2,v_1;
        v_100=p_time/100;
        v_50=(p_time%100)/50;
        v_20=(p_time%100%50)/20;
        v_10=(p_time%100%50%20)/10;
        v_5=(p_time%100%50%20%10)/5;
        v_2=(p_time%100%50%20%10%5)/2;
        v_1=(p_time%100%50%20%10%5)%2;
        m_print(p_time, v_100, v_50, v_20, v_10, v_5, v_2, v_1);	
}
    void m_print(int p_time,int p_100,int p_50,int p_20,int p_10,int p_5,int p_2,int p_1) {
        System.out.printf("%d%n", p_time);
        System.out.printf("%d nota(s) de R$ 100,00%n", p_100);
        System.out.printf("%d nota(s) de R$ 50,00%n", p_50);
        System.out.printf("%d nota(s) de R$ 20,00%n", p_20);
        System.out.printf("%d nota(s) de R$ 10,00%n", p_10);
        System.out.printf("%d nota(s) de R$ 5,00%n", p_5);
        System.out.printf("%d nota(s) de R$ 2,00%n", p_2);
        System.out.printf("%d nota(s) de R$ 1,00%n", p_1);
    }
}
