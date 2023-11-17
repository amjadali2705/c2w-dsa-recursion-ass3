class RemoveDuplicate {

    //loop
    // static String removeDup(String str) {
    //     char[] strArr = str.toCharArray();
    //     String newStr = "";
    //     for(char value : strArr) {
    //         if(newStr.indexOf(value) == -1)
    //             newStr += value;
    //     }
    //     return newStr;
    // }


    //recursion
    static String removeDup(String str) {
        if(str.length() == 0)
            return str;

        char firstChar = str.charAt(0);
        String remainingStr = removeDup(str.substring(1).replaceAll(String.valueOf(firstChar), ""));
        return firstChar+remainingStr;
    }

    public static void main(String[] args) {
        String str = "HappyNewYear";
        System.out.println(removeDup(str));
    }
}