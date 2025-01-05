public class prime {
    public static void main(String[] args) {
        int temp=0, s=20, e=50;
        for(int i=s; i<=e; i++) {
            for(int j=2; j<=i-1; j++) 
            {
                if(i%j==0) 
                    temp++;
            }
            if(temp==0) 
                System.out.print(i+", ");
            else
                temp=0;
        }
    }
}
