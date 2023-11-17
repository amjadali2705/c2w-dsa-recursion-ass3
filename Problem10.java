class PrintPermutations {

    static void printPermutations(String str, String res) {
        if(str.length() == 0) {
            System.out.println(res + " ");
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i+1);
            printPermutations(rem, res+ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "");
    }
}