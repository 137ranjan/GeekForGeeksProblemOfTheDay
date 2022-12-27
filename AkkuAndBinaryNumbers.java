

//Akku and Binary Numbers


class Solution{
    List<Long> arrList = new ArrayList<>();
    
    void precompute(){
        // Code Here
        for(int i=0; i<63; i++){
            for(int j=i+1; j<63; j++){
                for(int k=j+1; k<63; k++){
                    arrList.add( (1l << k) + (1l << j) + (1l << i) );
                }
            }
        }
        
        Collections.sort(arrList);
    }
    long solve(long L, long R){
        // Code here
        // System.out.println(arrList);
        int left = 0;
        int right = arrList.size() - 1;
        long a = binarySearch(left, right, L, "L");
        // System.out.println(a);
        long b = binarySearch(left, right, R, "R");
        // System.out.println(b);
        return b-a+1;
    }
    
    long binarySearch(int left, int right, long x, String flag){
       if(right >= left ){
           int mid = left + (right - left)/2;
           
           if (arrList.get(mid) == x){
                return mid;
           }
                
           if (arrList.get(mid) > x){
                return binarySearch(left, mid - 1, x,flag);
           }
                
           return binarySearch(mid + 1, right, x,flag);
       }
    //   System.out.println("left = "+left);
    //   System.out.println("right = "+right);
       if(flag.equalsIgnoreCase("L")){
           return left;
       }
       else{
           return right;
       }
    }
    
}
