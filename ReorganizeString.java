class Solution {
    public String reorganizeString(String s) {
        int[] charCount = new int[26]; 
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> charCount[b - 'a'] - charCount[a - 'a']);
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                maxHeap.offer((char) ('a' + i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            result.append(first);
            result.append(second);
            charCount[first - 'a']--;
            charCount[second - 'a']--;
            if (charCount[first - 'a'] > 0) {
                maxHeap.offer(first);
            }
            if (charCount[second - 'a'] > 0) {
                maxHeap.offer(second);
            }
        }
        
        if (!maxHeap.isEmpty()) {
            char lastChar = maxHeap.poll();
            if (charCount[lastChar - 'a'] > 1) {
                return "";
            }
            result.append(lastChar);
        }
        
        return result.toString();
    }
}
