package Assignment1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(Math.pow(x,2)+Math.pow(y,2)<=Math.pow(10,2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
