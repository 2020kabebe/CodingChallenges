public class ArrayManipulation {
    public static boolean hasContiguousSubarray(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 5};
        int target = 17;
        System.out.println(hasContiguousSubarray(arr, target));  // Output: true
    }
}