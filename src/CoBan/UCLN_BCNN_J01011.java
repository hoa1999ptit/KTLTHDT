/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class UCLN_BCNN_J01011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(bcnn(a,b)+" "+ucln(a,b));           
        }
    }
    public static int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }

    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }
}