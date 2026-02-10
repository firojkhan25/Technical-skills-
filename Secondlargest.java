//you are given an integer array A  >>>
//You have to find the second largest element/value >>>
public class Secondlargest{
    public static void main(String[] args) {
        int arr[] = {10,20,40,30,60};
        int max = arr[0];
        int second largest = new;
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
    


