public class NumberPalindrome {
    
  public static boolean isPalindrome(int number){
        int reverse = 0;
        if(number <0)
            number = number * -1;
        int ognumber = number;
        while(number >0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) +lastDigit;
            number /= 10;
        }

        if (reverse == ognumber){
            return true;
        }
        return false;
    }
}
