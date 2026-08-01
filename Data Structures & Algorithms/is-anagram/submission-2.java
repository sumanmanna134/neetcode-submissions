class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charArray = new int[26];
        int sLength = s.length();
        int tLength = t.length();
        if(sLength!=tLength){
            return false;
        }
        
        for(int i=0; i<sLength;i++){
            int index = s.charAt(i)-'a';
            charArray[index]++;
        }

        for(int i=0;i<tLength;i++){
            int index = t.charAt(i) - 'a';
            charArray[index]--;
        }

        for(int ele: charArray){
            if(ele!=0){
                return false;
            }
        }

        return true;
    }
}
