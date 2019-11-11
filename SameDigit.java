public class SameDigit {

    public static void main(String[] args) {

        System.out.println("hasSharedDigit "+hasSharedDigit(12,43));
    }

    public static boolean hasSharedDigit(int first, int second){
        if(first < 10 || first >99 || second <10 || second > 99)
            return false;
        else{
            while(first > 0){
                int lastDigit = first % 10;
                if(second % 10 == lastDigit || second /10 == lastDigit){
                    return true;
                }
                first /= 10;
            }
        }

        return false;
    }
}
