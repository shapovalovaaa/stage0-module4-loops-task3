package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberStr = Math.abs(t) + "";

        int length = numberStr.length();
        for (int i = 0; i < length; i++) {
            char digitChar = numberStr.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }

        System.out.println(sum);
    }
}
