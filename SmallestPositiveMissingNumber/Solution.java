class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int[] freqArr = new int[1000001];
        for(int i=0; i<size; i++){
            if(arr[i] > 0){
                freqArr[arr[i]]++;
            }
        }
        for(int i=1; i<=1000001; i++){
            if(freqArr[i] == 0){
                return i;
            }
        }
        
        return 1;
    }
}
