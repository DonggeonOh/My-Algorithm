package solutions;

import java.util.Scanner;

/*
 *  Problem : https://www.acmicpc.net/problem/1152
 *  Date    : 2019-03-13
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 *
 *  SOLVED!!!
 */
public class NumberOfWord {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        int i, length = str.length(), words = 0;

        if (length == 0) {
            System.out.println(length);
            return;
        }

        for (i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                continue;
            } else if (i - 1 >= 0) {
                if (str.charAt(i - 1) != ' ')
                    words++;
            }
        }

        if (str.charAt(length - 1) != ' ') words++;

        System.out.println(words);
    }
}
