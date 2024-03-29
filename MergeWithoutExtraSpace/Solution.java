class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        
        int left = n - 1;
        int right = 0;
        
        while(left >= 0 && right < m){
            if(arr1[left] > arr2[right]){
                
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                
                left--;
                right++;
                
            }else{
                
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
}
