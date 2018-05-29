package com.practice.tests;
import java.util.Arrays;

public class TestClass {
    public static void swap(char[] a, int pos1, int pos2)
    {
        char temp=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=temp;
    }

    public void execute()
    {
        char[] val = {'f','o','r','k'} ;

        //Temporary memory
        char[] val1=new char[val.length];
        char[] val2=new char[val.length];


        for(int i=0;i<val.length;i++)
        {

            swap(val,0,i);
            val1=Arrays.copyOf(val,val.length);
            for(int j=1;j<val1.length;j++)
            {
                swap(val1,1,j);
                val2=Arrays.copyOf(val1,val1.length);
                for(int k=2;k<val2.length;k++)
                {
                    swap(val2,2,k);
                    System.out.println(val2);
                }
                //System.out.println("======");
            }

        }

    }

}
