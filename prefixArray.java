public class prefixArray {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int m = arr.length;
        int pf[] = new int[m];
        pf[0] = arr[0];
        for (int i = 1; i < m; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            int ls;
            int rs;
            if (i == 0) {
                ls = 0;
            } else {
                ls = pf[i - 1];
            }
            rs = pf[m - 1] - pf[i];
            if (ls == rs) {
                count++;
                System.out.println("Equilibrium index: " + i);
            }
        }
        System.out.println("Total count = " + count);
    }
}
