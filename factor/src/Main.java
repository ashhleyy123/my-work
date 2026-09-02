import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int NumberOfFactor = 0;
        int i;
        int n = 36;
        for (i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    NumberOfFactor++;
                } else {
                    NumberOfFactor += 2;
                }

            }

        }
        System.out.println("count:" + NumberOfFactor);
    }
}
