public class FibonacciTest
{
    public static void main(String[] args)
    {
        int result=0;
        for(int i=1;;++i)
        {
            result=Fibonacci.of(i);
            if(result>200)break;
            System.out.println(result);
        }
    }
}

class Fibonacci
{
    static int of(int n)
    {
        int a=1;
        int b=1;
        int temp;
        for(int i=3;i<=n;++i)
        {
            temp=a;
            a=b;
            b+=temp;
        }
        return b；
    }
}