import java.util.Scanner;

public class p1067 {
    public static void main(String[] args) {
        odd_numbers object = new odd_numbers();
        object.m_read();
    }
}

class odd_numbers {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        byte v_number = a_teclado.nextByte(), v_count=1;
            while(v_count < v_number) {
                System.out.println(v_count);
                v_count+=2;
            }
        if(v_number%2!=0) System.out.println(v_number);
    }
}