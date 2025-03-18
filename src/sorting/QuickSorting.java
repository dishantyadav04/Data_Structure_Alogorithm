package sorting;

public class QuickSorting {
    private static void quickSort(int[] arr, int low, int high) {
        if (low<high) {
            int pi = partion(arr, low , high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1 ,high);
        }
    }

    private static int partion(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,2,3,1,4};

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        quickSort(nums, 0, nums.length-1);

        System.out.println("\nAfter Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


}
