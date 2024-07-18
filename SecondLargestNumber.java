public class SecondLargestNumber {


    public static void main(String[] args) {
        int[] arr = {20, 45, 67, 34, 76, 54, 86};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number: " + secondLargest);
    }
}
