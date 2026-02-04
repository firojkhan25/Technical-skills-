// Question>>>> Given an integer array A of size n. in 1 sec you can increase the value of 1 element by 1 
                         // find the minimum time in seconds to make all elements of thye array equal.
                         //  Observation >>>> To minimise the time make all element equal to the maximum element of the Array.
                         //  Steps 1 >> find the maximum element in thus array
                         //  Steps 2 >> for every element  calculate  howmuch it needs to be increase to reach the maximum
                         //  Steps 3 >> Sum all those diffrences
                
public class Array {
    public static void main(String[] args) {

        int a[] = {2, 5, 3, 4 , 6,};
        int n = a.length;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - a[i]);
        }
        System.out.println(+ time + " Sec");
    }
}
