package SearchSort;


import java.io.*;
public class SeqSort
{ 
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,j;
        int temp;
        int a[]=new int[5];
        System.out.println("Enter the 5  values of the array.");
        for(i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is-");
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
                