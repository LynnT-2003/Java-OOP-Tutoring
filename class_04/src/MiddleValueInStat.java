import java.util.Scanner;
import java.util.Arrays;
public class MiddleValueInStat {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many number(s)?: ");
        int n = myScanner.nextInt();
        double[] numberList = new double[n];
        for(int i = 0; i < numberList.length; i++) {
            System.out.print("Enter number#" + (i+1) + ":");
            numberList[i] = myScanner.nextDouble();
        }
        System.out.println("Mean:" + mean(numberList));
        System.out.println("Median:" + median(numberList));
        System.out.println("Mode:" + mode(numberList));

        myScanner.close();
    }
    public static double mean(double[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum/nums.length;

    }

    public static double median(double[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        if (nums.length % 2 == 0) {
            return nums[mid - 1];
        }
        return nums[mid];
    }

    public static double mode(double[] nums) {
        double maxValue = 0, maxCount = 0;

        for (int i = 0; i < nums.length; ++i) {
            int count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] == nums[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
}