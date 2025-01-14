class Solution {
    public int countBinarySubstrings(String s) {
        int count = 1;
        int minBlock=0;
        int sum=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i)){
                count++;
            }else{
                sum+= Math.min(minBlock,count);
                minBlock = count;
                count=1;
            }
        }
        return   sum+= Math.min(minBlock,count); 
        
    }
}
