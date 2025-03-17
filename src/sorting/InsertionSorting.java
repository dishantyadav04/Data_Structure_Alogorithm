package sorting;

public class InsertionSorting {
    public static void main(String[] args) {

        int[] nums = {6,5,2,8,4};
        int size = nums.length;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i=1; i< size; i++) {
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
