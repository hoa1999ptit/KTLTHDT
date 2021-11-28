/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class J02017_ThuGonDaySo {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[1005];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int c = 0, k;
        for (k = 0; k < a.length; k++) {

            if ((a[k] + a[k + 1]) % 2 == 0) {
                c++;
            }
        }
        System.out.println(c++);
    }

}
