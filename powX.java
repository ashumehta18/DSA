//X = let be any positive number
//code applicable in many forms just the neccessary changes are made in while loop
class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n == 0){
            return false;
        }
        while(n%X == 0){
           n = n/X ;
        }
        return n == 1;
    }
}
