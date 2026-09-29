import java.util.Scanner;

public class p1021 {
    public static void main(String[] args) {
        banknotes_and_coins object = new banknotes_and_coins();
        object.m_read();
    }
}

class banknotes_and_coins {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextFloat());
    }
    void m_calculate(float p_money) {
        int v_100,v_50,v_20,v_10,v_5,v_2,v_1,v_050,v_025,v_010,v_005,v_001;
        v_100=(int)p_money/100;
        v_50=((int)p_money%100)/50;
        v_20=((int)p_money%100%50)/20;
        v_10=((int)p_money%100%50%20)/10;
        v_5=((int)p_money%100%50%20%10)/5;
        v_2=((int)p_money%100%50%20%10%5)/2;
        v_1=((int)p_money%100%50%20%10%5)%2;
        v_050=(int)((p_money*100)%100)/50;
        v_025=(int)((p_money*100)%100%50)/25;
        v_010=(int)((p_money*100)%100%50%25)/10;
        v_005=(int)((p_money*100)%100%50%25%10)/5;
        v_001=(int)((p_money*100)%100%50%25%10%5);
        m_print(v_100, v_50, v_20, v_10, v_5, v_2, v_1, v_050, v_025, v_010, v_005, v_001);	
}
    void m_print(int p_100,int p_50,int p_20,int p_10,int p_5,int p_2,int p_1, int p_050,int p_025,int p_010,int p_005,int p_001) {
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", p_100);
        System.out.printf("%d nota(s) de R$ 50.00%n", p_50);
        System.out.printf("%d nota(s) de R$ 20.00%n", p_20);
        System.out.printf("%d nota(s) de R$ 10.00%n", p_10);
        System.out.printf("%d nota(s) de R$ 5.00%n", p_5);
        System.out.printf("%d nota(s) de R$ 2.00%n", p_2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", p_1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", p_050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", p_025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", p_010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", p_005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", p_001);
    }
}
