package SearchSort;


import java.io.*;
public class Linear_Search
{   static int b,n;
    static int k=0;
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the size of the array");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];

        System.out.println("Enter the  numbers on diff lines");
        for (int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }

        System.out.println("Enter the number to be searched");
        b=Integer.parseInt(in.readLine());

        for(int i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                k++;
            }

        }
        if(k!=0)
        {
            System.out.println("Number found");
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}
    

    