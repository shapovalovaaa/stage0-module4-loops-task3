package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev = 0;
        int curr = 1;
        System.out.println(prev);

        for (int i = 1; i < lastFibonacci; i++) {
            System.out.println(curr);

            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
