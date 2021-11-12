/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class KTDayNgoacDung_T210 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            xuly(s);
        }
    }

    private static void xuly(String s) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(s);
        while(sc.hasNext()){
            String tmp = sc.next();
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i)!=' ') {
                    st.push(tmp.charAt(i));
                }
                else{
                    while (!st.empty()) {                        
                        
                        System.out.print(st.peek());
                        st.pop();
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
