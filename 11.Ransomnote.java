class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        Arrays.sort(r);
        Arrays.sort(m);

        int r_pointer = 0;
        int m_pointer = 0;

        while(m_pointer < magazine.length()){
            if(r[r_pointer] == m[m_pointer]) r_pointer++;
            if(r_pointer == r.length) return true;
            m_pointer++;
        }
        return false;
    }
}

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 */