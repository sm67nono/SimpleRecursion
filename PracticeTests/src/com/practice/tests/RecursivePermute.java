package com.practice.tests;
/* Simple Recursion by smanna */

import java.util.Arrays;

public class RecursivePermute
{
    RecursivePermute()
    {
        String a="NOMAD";
        char val[] = a.toCharArray();
        recursive(val, 0);
    }
    public void recursive(char val[], int depth)//Index here determines the depth of nested for loops when using iteration
    {
        //Condition for the inner most loop
        if(depth==val.length)
        {
            System.out.println(val);
        }

        //Condition for creating more for loops
        for(int i=depth;i<val.length;i++)
        {
            TestClass.swap(val, depth, i);
            val=Arrays.copyOf(val,val.length);
            recursive(val, depth+1);
        }


    }
}
