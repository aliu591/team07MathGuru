/**
  * Yue Pan
  * HW3
  * 9/24/2018
  * fab(n) function
**/
public class calculation3{
    public long fab(int k){
        //base case
        long a = 0;
        long b = 1;

        //check corner case
        if (k <= 0){
            return a;
        }
        
        //calcualte fab
        while (k > 1){
            long temp = a + b;
            a = b;
            b = temp;
            k--;
        }

        return b;
    }
}