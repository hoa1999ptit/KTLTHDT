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
public class J02029_SXDoiChoTrucTiepLietKeNguoc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
                if (!isSorted(a)) {
                    in(a, i + 1);
                } else {
                    in(a, i + 1);
                    break;
                }
            }
        }
    }

    private static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void in(int[] a, int buoc) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < a.length; i++) {
            String tmp = "Buoc " + i + 1 + ":";
            tmp = tmp + " " + a[i];
            list.add(tmp);
        }
        Collections.reverse(list);
        for (String tmp : list) {
            System.out.println(tmp);
        }



//        System.out.format("Buoc %d: ", buoc);
//        for (int i = 0; i < a.length; i++) {
//            System.out.format("%d ", a[i]);
//        }
//        System.out.println();
    }
}
/*
1
6
5 8 3 9 1 4

OUTPUT
Buoc 5: 1 3 4 5 8 9
Buoc 4: 1 3 4 5 9 8
Buoc 3: 1 3 4 9 8 5
Buoc 2: 1 3 8 9 5 4
Buoc 1: 1 8 5 9 3 4
 */
