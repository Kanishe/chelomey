package org.example.springpool1;

public class P1SpringPool {
    public static void main(String[] args) {
        String s1 = new String("new String");
        String s2 ="new String";
        //compare link 2 variables s1 and s2
        System.out.println(s1 == s2);

        //compare object 2 variables s1 and s2
        System.out.println(s1.equals(s2));
    }
}
