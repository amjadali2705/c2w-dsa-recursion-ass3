//import java.util.Arrays;

class CheckAnagram {

    //loop
    // static boolean isAnagram(String str1, String str2) {
    //     if(str1.length() != str2.length())
    //         return false;

    //     char[] str1Arr = str1.toCharArray();
    //     char[] str2Arr = str2.toCharArray();

    //     Arrays.sort(str1Arr);
    //     Arrays.sort(str2Arr);

    //     for(int i=0; i<str1Arr.length; i++) {
    //         if(str1Arr[i] != str2Arr[i])
    //             return false;
    //     }
    //     return true;
    // }


    //recursion
    static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        if(str1.length()==0 && str2.length()==0)
            return true;

        int index = str2.indexOf(str1.charAt(0));
        if(index != -1) {
            String temp1 = str1.substring(1);
            String temp2 = str2.substring(0, index) + str2.substring(index+1);
            return isAnagram(temp1, temp2);
        } else
            return false;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }
}