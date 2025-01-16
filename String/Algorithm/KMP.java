class Solution {
    public static int[] buildLPS(String pat){
        int n=pat.length();
        int[] LPS = new int[n];
        LPS[0] =0;// First index of array bcz first char have no pre. and suffix pattern 
        int i=1; // for the pattern index
        int length=0;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(length)){
                length++;
                LPS[i]=  length;
                i++;
            }else{ // character not matches with length and i
                if(length!=0){ //length is not equal to 0
                    length = LPS[length-1];
                }else{  // length ==0
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        return LPS;
    }

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int i= 0 ; // track the txt
        int txtLength = txt.length();
        int j = 0; // track for the pattern
        int patLength = pat.length();
        int[] LPS = buildLPS(pat);
        ArrayList<Integer> ls = new ArrayList<>();
        while(i<txtLength){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(patLength==j){
                ls.add(i-j);
                j = LPS[j-1];
            }else if(i<txtLength && (pat.charAt(j)!=txt.charAt(i))){
                if(j>0){
                    j = LPS[j-1];
                }else{
                    i++;
                }
            }
        }
        return ls;
    }
}
