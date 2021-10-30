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
public class UocSoNguyenToLonNhat_TN02 {

    public static long x;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            for (long j = 1; j <= Math.sqrt(a); j++) {

                if (a % j == 0) {
                    if (isPrime(a / j)) {
                        System.out.println(a / j);
                        //System.out.println(j);
                    } else if (isPrime(j)) {
                        //x = j;
                        System.out.println(j);
                    }

                }
                //System.out.println(x);

            }
        }

    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
