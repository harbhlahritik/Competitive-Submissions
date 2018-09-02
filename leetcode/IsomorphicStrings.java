class Solution {
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        HashMap<Character,Character> hm1 = new HashMap<>();
        boolean isomorphic = true;
        for(int i = 0;i < length;i++){
            if(hm1.containsKey(s.charAt(i))){
                char c = hm1.get(s.charAt(i));
                if(c != t.charAt(i)){
                    isomorphic = false;
                }
            }
            hm1.put(s.charAt(i),t.charAt(i));
        }
        HashMap<Character,Character> hm2 = new HashMap<>();
        for(int i = 0;i < length;i++){
            if(hm2.containsKey(t.charAt(i))){
                char c = hm2.get(t.charAt(i));
                if(c != s.charAt(i)){
                    isomorphic = false;
                }
            }
            hm2.put(t.charAt(i),s.charAt(i));
        }
        return isomorphic;
    }
}