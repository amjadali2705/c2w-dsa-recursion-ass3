class ToUpperCase {

    //loop
    // static char[] upperCase(char[] arr) {
    //     for(int i=0; i<arr.length; i++) {
    //         arr[i] = Character.toUpperCase(arr[i]);
    //     }
    //     return arr;
    // }


    //recursion
    static void upperCase(char[] arr, int index) {
        if(index < arr.length) {
            arr[index] = Character.toUpperCase(arr[index]);
            upperCase(arr, index+1);
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[] {'a', 'b', 'c', 'd', 'e'};
        upperCase(arr, 0);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}