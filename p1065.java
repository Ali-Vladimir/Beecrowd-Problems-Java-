import java.util.Scanner;

public class p1065 {
    public static void main(String[] args) {
        even_between_five_numbers object = new even_between_five_numbers();
        object.m_read();
    }
}

class even_between_five_numbers {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        int v_count=0;
        for(int i=0; i<5; i++) {
            if(a_teclado.nextInt()%2==0) {
                v_count++;
            }
        }
        System.out.println(v_count + " valores pares");
    }
}