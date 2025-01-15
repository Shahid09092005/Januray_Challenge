class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        String[] arr = s.split(" ");
        int slen= arr.length;
        int patlen = pattern.length();
        if(patlen!=slen) return false;
        for(int i=0;i<patlen;i++){
            String word = arr[i];
            char currChar = pattern.charAt(i);
            if(map.containsKey(currChar)){
                if(!map.get(currChar).equals(word)){
                    return false;
                }
            }else{
                if(map.containsValue(word)){// it ensure that no repeated words insert 
                    return false;
                }
                map.put(currChar,word);
            }
        }
        return true; 
        
    }
}
