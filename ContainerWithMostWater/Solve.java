class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        int l = 0, r = len - 1;
        long area = 0;
        while(l < r){
            long newArea = Math.min(A[l], A[r])*(r - l);
            area = Math.max(area, newArea);
            if(A[l] < A[r]){
                l++;
            }else{
                r--;
            }
        }
        
        return area;
        
    }
    
}
