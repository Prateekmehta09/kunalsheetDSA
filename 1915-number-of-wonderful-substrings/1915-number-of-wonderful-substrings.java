class Solution {
    public long wonderfulSubstrings(String word) {
           int[] count = new int[1024]; 
        long wonderfulSubstringsCount = 0;
        int bitmask = 0;
        count[0] = 1;
        for (char c : word.toCharArray()) {
            bitmask ^= 1 << (c - 'a');
          
            wonderfulSubstringsCount += count[bitmask];
         
            for (int i = 0; i < 10; i++) {
                wonderfulSubstringsCount += count[bitmask ^ (1 << i)];
            }
            
            // Increment the count of substrings with the same bitmask
            count[bitmask]++;
        }
        
        // Return the total count of wonderful substrings
        return wonderfulSubstringsCount;
    }
}