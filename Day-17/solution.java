class Solution {
    public int minimumDeletions(String s) {
        int rightA=0;
        for(char i:s.toCharArray()){
            if(i=='a'){
            rightA++;
            }
        }
        int leftB=0;
        int ans=rightA;
        for(char i:s.toCharArray()){
            if(i=='a'){
                rightA--;
            }
            else{
                leftB++;
            }
            ans=Math.min(ans,rightA+leftB);
        }
        return ans;
    }
}