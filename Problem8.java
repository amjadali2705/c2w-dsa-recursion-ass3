class DivideString {

    //loop
    // static void geStrings(String str, int n) {
    //     int size = str.length()/n;
    //     String[] strArr = new String[size];
    //     for(int i=0; i<size; i++) {
    //         strArr[i] = str.substring(n*i, n*(i+1));
    //     }
    //     for(int i=0; i<size; i++) {
    //         System.out.println(strArr[i]);
    //     }
    // }


    //recursion
    static String[] geStrings(String str, int n, String[] strArr, int size) {
        int i = (strArr.length)-size;
        if(i == strArr.length)
            return strArr;

        strArr[i] = str.substring(n*i, n*(i+1));
        return geStrings(str, n, strArr, size-1);
    }

    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int n = 4;
        // geStrings(str, n);

        int size = str.length()/n;
        String[] strArr = new String[size];

        geStrings(str, n, strArr, size);
        
        for(int i=0; i<size; i++) {
            System.out.println(strArr[i]);
        }
    }
}