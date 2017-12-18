package P05;

import java.util.Scanner;

public class GhetoNumeral {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String digits= console.nextLine();
        StringBuilder word = new StringBuilder("");
        int[]arr = new int[digits.length()];
        for (int i = 0; i <digits.length() ; i++) {
            arr[i]=digits.charAt(i)-'0';
            switch (arr[i]){
                case 0:
                    word.append("Gee");
                    break;
                case 1:
                   word.append("Bro");
                   break;
                case 2:
                    word.append("Zuz");
                    break;
                case 3:
                    word.append("Ma");
                    break;
                case 4:
                    word.append("Duh");
                    break;
                case 5:
                    word.append("Yo");
                    break;
                case 6:
                    word.append("Dis");
                    break;
                case 7:
                    word.append("Hood");
                    break;
                case 8:
                    word.append("Jam");
                    break;
                case 9:
                    word.append("Mack");
            }

        }
        System.out.println(word);
    }
}
