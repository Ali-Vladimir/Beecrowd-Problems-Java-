import java.util.Scanner;

public class p1059 {
    public static void main(String[] args) {
        even_numbers object = new even_numbers();
        object.m_print();
    }
}

class even_numbers {
    void m_print() {
        for(int i=2; i<=100; i+=2) {
            System.out.println(i);
        }
    }
}