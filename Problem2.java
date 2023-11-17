class ReplaceChar {

    //loop
    // static String replaceChar(String str) {
    //     return str.replaceAll("a", "l");
    // }


    //recursion
    static String replaceChar(String str, int index) {
        if(index == str.length())
            return "";

        String str1;
        if(str.charAt(index) == 'a')
            str1 = "l";
        else
            str1 = String.valueOf(str.charAt(index));

        return str1 + replaceChar(str, index+1);
    }

    public static void main(String[] args) {
        String str = "Amjad";
        System.out.println(replaceChar(str, 0));
    }
}