/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeQuy;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DoiChoChuSo_TN17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int k = in.nextInt();
            String s = in.nextLine();
//            String reverseS = swap(s);
//            System.out.println(reverseS);
            for (int j = 0; j < s.length(); j++) {
                //int Max = s[s.length()-1];
                
            }
        }
    }

    public static String swap(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (true) {
                s1 += s.charAt(s.length() - 1 - i);

            }
        }
        return s1;
    }
}
