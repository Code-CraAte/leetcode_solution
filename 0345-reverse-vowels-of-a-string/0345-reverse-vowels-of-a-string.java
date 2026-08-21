class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!vowels.contains(arr[left])) {
                left++;
            }
            else if (!vowels.contains(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}