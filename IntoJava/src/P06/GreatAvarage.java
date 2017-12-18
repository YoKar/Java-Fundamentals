package P06;

import java.util.Scanner;

public class GreatAvarage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum=0.0;
        for (int i = 0; i < 3; i++) {
            double numbers = Double.parseDouble(console.nextLine());
            sum+=numbers;
        }
        System.out.printf("%.2f",sum/3);
    }
}
