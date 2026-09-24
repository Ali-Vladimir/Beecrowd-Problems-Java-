import java.util.Scanner;

public class p1014 {
    public static void main(String[] args) {
        dist_2_pts object = new dist_2_pts();
        object.m_read();
    }
}

class dist_2_pts {
    Scanner a_teclado = new Scanner(System.in);
    void m_read() {
        m_print(m_calculate(a_teclado.nextDouble(),a_teclado.nextDouble(),a_teclado.nextDouble(),a_teclado.nextDouble()));
    }
    double m_calculate(double p_disx1,double p_disy1,double p_disx2,double p_disy2) {
	double v_dis1 = p_disx2 - p_disx1, v_dis2 = p_disy2 - p_disy1;
        return Math.sqrt((v_dis1 * v_dis1) + (v_dis2 * v_dis2));
    }
    void m_print(double p_result) {
        System.out.printf("%.4f\n",p_result);
    }
}
