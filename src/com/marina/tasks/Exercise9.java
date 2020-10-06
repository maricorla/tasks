package com.marina.tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise9 {


        public static void main(String[] args)

        {
            int i,j,n;
            System.out.print("Input number of rows : ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                    System.out.print(i);

                System.out.println("");
            }
        }

  /*  int i,j,n,k = 1;
            System.out.print("Input number of rows : ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

            for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
            System.out.print(k++);

        System.out.println("");
    }
}*/

    }
