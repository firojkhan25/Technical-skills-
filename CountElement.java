public class CountElement {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
