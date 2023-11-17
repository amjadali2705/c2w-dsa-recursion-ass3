class CountVowels {

    //loop
    // static int getVowelsCount(String str) {
    //     int count = 0;
    //     for(int i=0; i<str.length(); i++) {
    //         if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
    //             count++;
    //     }
    //     return count;
    // }


    //recursion
    static int getVowelsCount(String str) {
        if(str.length() == 0)
            return 0;

        int count;
        if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u' || str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I' || str.charAt(0)=='O' || str.charAt(0)=='U')
            count = 1;
        else
            count = 0;
        
        return count + getVowelsCount(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "Amjad";
        System.out.println(getVowelsCount(str));
    }
}