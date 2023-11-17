class ToLowerCase {

    //loop
    // static char[] lowerCase(char[] arr) {
    //     for(int i=0; i<arr.length; i++) {
    //         arr[i] = Character.toLowerCase(arr[i]);
    //     }
    //     return arr;
    // }


    //recursion
    static void lowerCase(char[] arr, int index) {
        if(index < arr.length) {
            arr[index] = Character.toLowerCase(arr[index]);
            lowerCase(arr, index+1);
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[] {'A', 'B', 'C', 'D', 'E'};
        lowerCase(arr, 0);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}