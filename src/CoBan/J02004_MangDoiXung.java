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
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // ktra doi xung
        boolean ok = true;
        int x;
        for (int i = 0; i <= n / 2; i++) {
            x = n - 1 - i;
            if (arr[i] != arr[x]) {
                ok = false;
                break;
            }
        }
        if (ok == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
