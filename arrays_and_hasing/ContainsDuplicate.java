import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ContainsDuplicate
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        boolean ans = containsDuplicate.containsDuplicate(arr);
        if (ans == true) {

            System.out.println("contains duplicate");
        } else {
            System.out.println("does not contains duplicate");
        }

        sc.close();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (uniqueSet.contains(nums[i])) {
                return true;
            } else {
                uniqueSet.add(nums[i]);
            }
        }
        return false;
    }
}