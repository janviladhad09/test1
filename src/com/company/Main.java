//TWO FRE PROGRAM:easy

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        str = sc.nextLine();
        Twofer t=new Twofer();

        System.out.println(t.twofer(str));
    }
}

class Twofer {


    public String twofer(String name)
    {
        return (name == null) ? append("you") : append(name);
    }
    private String append(String name)
    {
        return "One for " + name + ", one for me.";
    }

}
