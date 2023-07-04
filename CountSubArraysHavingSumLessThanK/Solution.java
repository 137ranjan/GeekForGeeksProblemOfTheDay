/*
*Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k.
*/

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
        int count = 0;
        long p = 1;
        for(int start = 0, end = 0; end < n; end++){
           
            p = p*a[end];
            while(start < end && p >= k){
                p = p/a[start];
                start++;
            }
            if(p < k){
                int len = end - start + 1;
                count = count + len;
            }
        }
        return count;
    }
}
