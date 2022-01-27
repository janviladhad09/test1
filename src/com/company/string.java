//Reverse String : easy
package com.company;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("Enter a String: ");
        str = sc.nextLine();
        Reverse r = new Reverse();
        System.out.println(r.reverseStr(str));

    }
}

class Reverse {
    public static String reverseStr(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }

}