import java.util.*;
public class fibseries
{
    public static void main(String[]args)
    {
        try{
            int a=0;
            int b=1;
            int result=0;
            Scanner s=new Scanner(System.in);
            System.out.println("n:");
            int n=s.nextInt();
            if(n<0)
            {
                throw new IllegalArgumentException("No negative values");
            }
            if(n==0)
            {
                System.out.println("zero cannot be taken");
            }
            for(int i=1;i<=n;i++)
            {
                result=a+b;
                System.out.println(" "+result);
                a=b;
                b=result;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input cannot be integer");
        }
        catch(IllegalArgumentException ae)
        {
            System.out.println("   enter a valid value"+ae);
        }
    }
}

        
    
