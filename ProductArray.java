// Given an Array of integer   find  return  and  product of  where ith element of the product array will be equal to the product of all
 // element divide by the ith of the array  >>>> 
class ProductArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }

        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = product / arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
