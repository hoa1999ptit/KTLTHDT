/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.Scanner;

// kiểm tra mảng đảo ngược
// dùng vòng lặp for duyệt i = 0 đến i < n / 2
// nếu A[i] != A[n - i -1]
// thì mảng đó không phải mảng đối xứng
public class J02004_MangDoiXung {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int kt =1;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < n / 2; j++) {
                if (a[j] != a[n - j - 1]) {
                    kt=0;
                    break;
                }
            }
            if (kt==0) {
                System.out.println("NO");
            }else System.out.println("YES");
        }
    }

}
