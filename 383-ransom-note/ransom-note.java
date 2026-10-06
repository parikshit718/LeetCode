class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map2.keySet()) {
            if (!map.containsKey(ch) || map2.get(ch) > map.get(ch)) {
                return false;
            }
        }

        return true;
    }
}