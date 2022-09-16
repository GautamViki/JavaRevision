package Assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lottery Number in 3 digit ");
        String lotteryNum=sc.next();
        String originalNum="587";
        winLottery(lotteryNum,originalNum);
    }
    public static void winLottery(String lott,String orig){
        if(lott.equals(orig)){
            System.out.println("You win $10000");
            return;
        }
        Map<Character,Integer> mapLott=createMap(lott);
        Map<Character,Integer> mapOrig=createMap(orig);
        System.out.println(mapOrig);
        System.out.println(mapLott);
        int count=0;
        for(Map.Entry<Character,Integer> m:mapLott.entrySet()){
            if (mapOrig.containsKey(m.getKey())){
                if (mapOrig.get(m.getKey())==m.getValue()){
                    count+=m.getValue();
                } else if (mapOrig.get(m.getKey())>m.getValue()) {
                    count+=mapOrig.get(m.getKey())-m.getValue();
                } else if (mapOrig.get(m.getKey())<m.getValue()) {
                    count+=mapOrig.get(m.getKey());
                }
            }
        }
        System.out.println(count);
        if(count==3){
            System.out.println("You win $3000");
            return;
        } else if (count==1) {
            System.out.println("You win $1000");
        }
    }
    public static Map<Character,Integer> createMap(String str){
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
}
