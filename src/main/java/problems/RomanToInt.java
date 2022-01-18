package problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    /*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int number = 0;
        int currentValue = 0;
        int nextPos = 0;
        for (int i=0; i<s.length(); i++){
            currentValue = map.get(s.charAt(i));
            nextPos = i+1;
           if (nextPos<s.length() && currentValue<map.get(s.charAt(nextPos))){
               number += map.get(s.charAt(nextPos)) - currentValue;
               i++;
           }else{
               number += currentValue;
           }
        }
        return number;
    }

    public static void main(String[] args) {
        /*
        Input: s = "III"
        Output: 3
         */
        System.out.println(romanToInt("MCMXCIV"));
    }


    /*
        public int romanToInt(String s) {
            int result = 0;
            int len = s.length();
            int prev = 0;
            for (int i = 0; i < len; i++) {
                int cur = romanSymbolToInt(s.charAt(i));
                result += cur;
                if (prev < cur) {
                    result -= prev * 2;
                }
                prev = cur;
            }
            return result;
        }

        private int romanSymbolToInt(char c) {
            if (c == 'M') {
                return 1000;
            } else if (c == 'D') {
                return 500;
            } else if (c == 'C') {
                return 100;
            } else if (c == 'L') {
                return 50;
            } else if (c == 'X') {
                return 10;
            } else if (c == 'V') {
                return 5;
            } else if (c == 'I') {
                return 1;
            }
            return 0;
         }
     */
}
