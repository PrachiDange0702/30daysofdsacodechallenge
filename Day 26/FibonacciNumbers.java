class Solution
{
    // Function to return a list containing the first n Fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long[] result = new long[n];
        if (n >= 1) {
            result[0] = 1;
        }
        if (n >= 2) {
            result[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }
}




