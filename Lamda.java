import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
  PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    PerformOperation isPrime() {

        return a -> {

            if (a < 2)
                return false;

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0)
                    return false;
            }

            return true;
        };
    }

    PerformOperation isPalindrome() {

        return a -> {

            int temp = a;
            int rev = 0;

            while (temp > 0) {

                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            return rev == a;
        };
    }
}
