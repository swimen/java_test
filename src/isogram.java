import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.HashMap;

    public class isogram {
        private static HashMap<Long, Long> f_map = new HashMap<Long, Long>();
        private static String s = "1 2 3 4 56";
        private static String [] nums =  s.split(" ");
        public static long fib (long n )
        {   long rez;
            if (n == 0)  return 0;
            if (n == 1)  return 1;
            if (f_map.containsKey(n)) return f_map.get(n);
            rez = fib(n-1) + fib(n-2);
            f_map.put(n, rez);
            return rez;
        }
        public static boolean  isIsogram(String str) {
            char [] char_arr = str.toLowerCase().toCharArray();
            char c;

            HashMap<Character, Integer> char_map = new HashMap<Character, Integer>();
            for (int i=0; i<char_arr.length;i++)
            {
                if (char_map.containsKey(char_arr[i])) return false;
          else char_map.put(char_arr[i],1);
            }
            // ...
            return true;
        }
        public static void main(String[] args)
        {
            long l1 = 5;
            long l2 = 3;
            long l3 = l2*l1;
            l3 = l2 * l1;
            System.out.println("Start");
            if (isogram.isIsogram("Dermatoglyphics")) System.out.println("true"); else System.out.println("false");
            if (isogram.isIsogram("moOse")) System.out.println("true"); else System.out.println("false");
            System.out.println(fib(1));
            System.out.println(fib(2));
            System.out.println(fib(3));
            System.out.println(fib(4));
            System.out.println(Math.floor(1.7));
        }

    }
