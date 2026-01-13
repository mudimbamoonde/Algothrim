/***
 * @AUTHOR : Moonde Mudimba
 *the two first Fibonacci numbers are 0 and 1, and the next Fibonacci number
 * is always the sum of the two previous numbers, so we get 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 *
 */
public class Fibonacci {
    /*
*
How it works:
1. Start with the two first Fibonacci numbers 0 and 1.
    a) Add the two previous numbers together to create a new Fibonacci number.
    b) Update the value of the two previous numbers.
Do point a and b above 18 times.
* */
    private static int times = 2;

    public static void main(String[] args) {
//        FibNums(0,1,18);
        FibNumsRecursion(0,1,1,18);
    }



//    LOOP implementation
    public static void FibNums(int prev, int end , int times){
        int FiboNewValue;
        System.out.println(prev);
        System.out.println(end);
        for(int i=0; i<times; i++) {
            FiboNewValue = end + prev;
            System.out.println(FiboNewValue);
            prev = end;
            end = FiboNewValue;
        }


    }

//    Recursion
public static void FibNumsRecursion(int prev, int current, int count, int limit) {
    // Base case: stop when the count exceeds the limit
    if (count > limit) {
        return;
    }

    System.out.println(current); // Print the current Fibonacci number

    // Recursive call: calculate the next number, increment the count
    FibNumsRecursion(current, prev + current, count + 1, limit);
}





}
