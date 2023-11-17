class CheckPalindrome {

    //loop
    // static boolean isPalindrome(String str) {
    //     int start = 0;
    //     int end = str.length()-1;
    //     while(start < end) {
    //         if(str.charAt(start) != str.charAt(end))
    //             return false;

    //         start++;
    //         end--;
    //     }
    //     return true;
    // }


    //recursion
    static boolean isPalindrome(String str, int start, int end) {
        if(start >= end)
            return true;
        
        if(str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        // System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}