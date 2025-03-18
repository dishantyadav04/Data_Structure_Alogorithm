package sorting;

public class MergeSorting {

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftNums = new int[n1];
        int[] rightNums = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftNums[i] = nums[left + i];
        }

        for (int i = 0; i < n2; i++) {
            rightNums[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftNums[i] <= rightNums[j]) {
                nums[k] = leftNums[i];
                i++;
            } else {
                nums[k] = rightNums[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = leftNums[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = rightNums[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 4, 6, 2};
        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        mergeSort(nums, 0, nums.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
