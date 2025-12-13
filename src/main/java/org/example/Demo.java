package org.example;


public class Demo {
    public static void main(String[] args) {
        String Name="Nitesh";
        String rev= "";
        int len= Name.length();

        for(int i=len-1;i>=0;i--){
            rev= rev + Name.charAt(i);
        }
        System.out.println(rev);
    }
}
