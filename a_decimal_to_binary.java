package Prac_42_BIT_maniplutaion;

import java.util.Scanner;

public class a_decimal_to_binary {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        fun(num);
        // slow(num);
        fast(num);

        
    }


    public static void slow(int num)
    {

        int ans=0;
        int i=0;
        while(num!=0)
        {
            int rem=num%2;
            ans=ans+rem*(int)(Math.pow(10,i));
            i++;

            num=num/2; 
        }

        System.out.println(ans);
    }

    public static void fun(int num)
    {
        int l=0 ;
        int h=num/2;
        int ans=0;

        while(l<=h)
        {
            int mid=(l+h)/2;
            int value=(int)(Math.pow(2,mid));
            if(value<=num)
            {
                ans=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        System.out.println(ans);
    }
  
    public static void fast( int num)
    {
      

        //87
        int start=-1;

        for(int i=0;;i++)
        {
            if(num<(int)(Math.pow(2,i)))
            {
                start=i-1;
                break;
            }
        }
        int ans=0;

        for(int i=start;i>=0 ;i--)
        {
            if(num>=(int)(Math.pow(2,i)))
            {
                ans=ans+1*(int)(Math.pow(10,i));
                num=num-(int)(Math.pow(2,i));
            }
        }
        System.out.println(ans);


    }
    
}
