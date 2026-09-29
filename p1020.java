import java.util.Scanner;

public class p1020 {
    public static void main(String[] args) {
        age_in_days object = new age_in_days();
        object.m_read();
    }
}

class age_in_days {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_calculate(a_teclado.nextInt());
    }
    void m_calculate(int p_time) {
        int v_years=p_time/365,v_months=(p_time-v_years*365)/30,v_days=(p_time%365)%30;
	m_print(v_years, v_months, v_days);	
}
    void m_print(int p_years,int p_months,int p_days) {
        System.out.printf("%d ano(s)%n", p_years);
        System.out.printf("%d mes(es)%n", p_months);
        System.out.printf("%d dia(s)%n", p_days);
    }
}
