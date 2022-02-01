class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c:magazine.toCharArray()){
            int numCount = hm.getOrDefault(c, 0)+1;
            hm.put(c, numCount);
        }
        for(char c: ransomNote.toCharArray()){
            int numCount = hm.getOrDefault(c, 0)-1;
            if(numCount<0) return false;
            hm.put(c, numCount);
        }
         return true;
    }
}
