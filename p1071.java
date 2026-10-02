import java.util.Scanner;

public class p1071 {
    public static void main(String[] args) {
        sum_consecutive_odd_numbers object = new sum_consecutive_odd_numbers();
        object.m_read();
    }
}

class sum_consecutive_odd_numbers {
    Scanner a_teclado = new Scanner(System.in);

    void m_read() {
        int v_first_number = a_teclado.nextInt();
        int v_second_number = a_teclado.nextInt();
        int v_sum = 0;

        int v_lower_limit = Math.min(v_first_number, v_second_number);
        int v_upper_limit = Math.max(v_first_number, v_second_number);

        v_lower_limit++;

        while (v_lower_limit < v_upper_limit) {
            if (v_lower_limit % 2 != 0) {
                v_sum += v_lower_limit;
            }
            v_lower_limit++;
        }

        m_write(v_sum);
    }

    void m_write(int v_sum) {
        System.out.println(v_sum);
    }
}
