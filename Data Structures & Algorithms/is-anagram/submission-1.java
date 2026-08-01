class Solution {
    public boolean isAnagram(String s, String t) {
        // i will use hashSet
        HashMap<Character,Integer> freq = new HashMap<>();
        int sLength = s.length();
        int tLength = t.length();
        if(sLength!=tLength){
            return false;
        }

        for(int i=0;i<sLength;i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<tLength;i++){
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i),0)-1);
        }

        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }


        return true;
    }
}
