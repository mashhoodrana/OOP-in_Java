public class Exercise10loops {
    public static void main(String[] args) {

        String r = "121";
        boolean isPalindrome = true;
        int y = r.length() - 1;
        for(int x = 0; x < y; x++, y-- )
        {
            if (r.charAt(x) == r.charAt(y))
                continue;

            isPalindrome = false;
                break;

        }
        System.out.println(isPalindrome ? "Palindrome" : "not palindrome" );
    }
}
