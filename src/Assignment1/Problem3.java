package Assignment1;

import java.time.LocalDateTime;
import java.util.Date;

public class Problem3 {
    public static void main(String[]args){
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        String s3 = "Value1";
        String s2 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s3 = s3 + s2;
        }

        System.out.println(now);
        StringBuffer s5 = new StringBuffer("Value1");
        String s7 = "Value2";

        for (int i = 0; i < 100000; ++i) {
            s5.append(s7);
        }
        System.out.println(now);
    }
}
