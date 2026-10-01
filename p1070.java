import java.util.Scanner;

public class p1070 {
    public static void main(String[] args) {
        six_odd_numbers object = new six_odd_numbers();
        object.m_read();
    }
}

class six_odd_numbers {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        int v_number = a_teclado.nextInt(), v_count=0;
        while(v_count < 6) {
            if(v_number%2!=0) {
                System.out.println(v_number);
                v_count++;
            }
            v_number++;
        }
    }
}