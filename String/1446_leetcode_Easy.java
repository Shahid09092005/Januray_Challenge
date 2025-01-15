class Solution {
    public int maxPower(String s) {
        if(s.length()==1) return 1;
        int c=1;
        int max=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }else{
                max = Math.max(max,c);
                c=1;
            }
        }
        return Math.max(max,c);
    }
}
