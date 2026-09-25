import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {
        time_conversion object = new time_conversion();
        object.m_read();
    }
}

class time_conversion {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextInt());
    }
    void m_calculate(int p_time) {
        int v_hours=p_time/3600,v_minutes=(p_time-v_hours*3600)/60,v_seconds=p_time%60;
	m_print(v_hours, v_minutes, v_seconds);	
}
    void m_print(int p_hours,int p_minutes,int p_seconds) {
        System.out.printf("%d:%d:%d%n", p_hours, p_minutes, p_seconds);
    }
}
