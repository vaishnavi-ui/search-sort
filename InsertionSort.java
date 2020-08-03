package SearchSort;

import java.io.*;
public class InsertionSort
{
    public static void main() throws IOException
    {
        int a[]={-2,101,48,19,7};
        int i,j;
        int len=a.length;
        int key;

        //         for(i=1;i<len;i++)
        //         {
        //             key=a[i];
        //             
        //             for(j=i-1;j>=0&&a[j]>key;j--)
        //             {
        //                 a[j+1]=a[j];
        //             }
        //             a[j+1]=key;
        //         }

        for(i=1;i<len;i++)
        {
            key=a[i];
            j=i-1;
            while(j>=0&&a[j]<key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("the sorted array is:");
        for(i=0;i<len;i++)
        {
            System.out.println(a[i]);
        }

    }

}

