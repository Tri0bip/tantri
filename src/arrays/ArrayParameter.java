package arrays;

public class ArrayParameter {

    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};
        double avg = average(iq);
        System.out.println("Average IQ = " + avg);
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int numbers : array) {
            sum += numbers;
        }
        return (double) sum / array.length;
    }
}
