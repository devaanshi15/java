public class palindrome {
    public static void main(String[] args) {
        int n=121, rem,rev=0;
        int number = n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        if(number==rev)
            System.out.println("we have a Palindrome ->"+number+" = "+rev);
        else
            System.out.println("Not a Palindrome->"+number+" = "+rev);
    }
}
