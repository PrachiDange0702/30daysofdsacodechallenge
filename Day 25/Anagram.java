class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        a = a.toLowerCase();
    b = b.toLowerCase();

    // Create an array to count the frequency of each character in the first string.
    int[] charCounts = new int[256];
    for (int i = 0; i < a.length(); i++) {
      charCounts[a.charAt(i)]++;
    }

    // Iterate over the characters of the second string and decrement the corresponding count in the array.
    for (int i = 0; i < b.length(); i++) {
      if (charCounts[b.charAt(i)] == 0) {
        return false;
      } else {
        charCounts[b.charAt(i)]--;
      }
    }

    // If all counts in the array are zero, then the strings are anagrams.
    return Arrays.stream(charCounts).allMatch(count -> count == 0);
        
    }
}
