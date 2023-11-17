class CompareStrings {

    //loop
    // static boolean isEqual(String str1, String str2) {
    //     if(str1.length() != str2.length())
    //         return false;

    //     for(int i=0; i<str1.length(); i++) {
    //         if(str1.charAt(i) != str2.charAt(i))
    //             return false;
    //     }
    //     return true;
    // }


    //recursion
    static boolean isEqual(String str1, String str2, int index) {
        if(str1.length()!=str2.length() || index==str1.length())
            return str1.equals(str2);

        if(str1.charAt(index) != str2.charAt(index))
            return false;
        
        return isEqual(str1, str2, index+1);
    }

    public static void main(String[] args) {
        String str1 = "Amjad";
        String str2 = "Amjad";
        //System.out.println(isEqual(str1, str2));
        System.out.println(isEqual(str1, str2, 0));
    }
}