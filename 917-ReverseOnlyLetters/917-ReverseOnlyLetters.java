// Last updated: 9/6/2026, 9:30:09 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            } else if (!Character.isLetter(arr[start])) {
                start++;
            } else {
                end--;
            }
        }
        return new String(arr);
    }
}