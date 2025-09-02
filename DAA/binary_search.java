package DAA;
public class binary_search {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 20, 25, 30};
        int target = 20;
        int left = 0;
        int right = numbers.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                System.out.println("number found");
                found = true;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("number not found");
        }
    }
}
