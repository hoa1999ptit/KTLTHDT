/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA09004_DFS_DoThiVoHuong {

    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

        }
    }

    static void DFS(int u) {
        check[u] = 0;
        System.out.print(u + " ");
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (check[v] == 1) {
                DFS(v);
            }
        }
    }
}
