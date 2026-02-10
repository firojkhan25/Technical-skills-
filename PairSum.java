// Given an array N  element cheak  if there exists a pair(i,j) such that arr [i]+ arr [j ]== 
// and i = j >>>>
// NOTE :  I and j re the index   k is the given  sum 
class PairSum {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6 ,7 , 9};
        int k = 10;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
