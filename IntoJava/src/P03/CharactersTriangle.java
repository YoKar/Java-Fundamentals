package P03;

import java.util.Scanner;

public class CharactersTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in );
        int n = Integer.parseInt(console.nextLine());
        for (int i = 'a'; i < n+'a'; i++) {
            for (int j = 'a'; j <= i; j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        for (int i = (n)+'a'-2; i >='a' ; i--) {
            for (int j = 'a'; j <= i; j++) {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
