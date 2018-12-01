/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_ass;

import java.io.*; 
import java.util.*; 

/**
 *
 * @author Team 11.
 */
public class SE_ass {

    

/**
 *
 * @author Team 11.
 */


    /**
     * @param args the command line arguments
     */
//***************************Function get median ******************************//
    public void getMedian(char arr[])
    {
        double median=0;
        for(int i=0;i<arr.length;i++)
        {
            char temp;
            for (int j = i; j > 0; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        if (arr.length % 2 == 0)
            median = ((double)Character.getNumericValue(arr[arr.length/2]) + (double)Character.getNumericValue(arr[arr.length/2 - 1]))/2;
        else
            median =  Character.getNumericValue(arr[arr.length/2]);

        System.out.println("the median is : " + median);

    }

//------------------------------------------Function prime_num
	public static void prime_num (char[] arr) {
		int max=1000;
		System.out.print("\nPrime number : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<max;j++) {
				if((Character.getNumericValue(arr[i]))==1) {
					break;
				}else if((Character.getNumericValue(arr[i]))%j==0 && (Character.getNumericValue(arr[i]))!=j) {
					break;
				}else if(j==max-1) {
					System.out.print((Character.getNumericValue(arr[i]))+" ");
				}
			}
		}
		System.out.print("\n=================================\n");
	}
	//--------------------------------------------------------------
	 public static void maximum3Elements(char arr[] ) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE; 
		
		int arr1[]= new int[arr.length];
		
		for(int j=0;j<arr.length;j++){
			arr1[j]=Integer.parseInt(String.valueOf(arr[j]));
					}
		
		for (int i = 0; i < arr1.length; i++) {
		    if (arr1[i] > max1) {
		        max3 = max2;
		        max2 = max1;
		        max1 = arr1[i];
		    } else if (arr1[i] > max2) {
		        if (max1 == arr1[i]) {
		            
		        } else {
		            max3 = max2;
		            max2 = arr1[i];
		        }
		    } else if (arr1[i] > max3) {
		        if (max1 == arr1[i] || max2 ==arr1[i]) {
		           
		        } else {
		            max3 = arr1[i];
		        }
		    }
		}
		System.out.println("Maximum 1 =>> "+max1+"\n");
		System.out.println("Maximum 2 =>> "+max2+"\n");
		System.out.println("Maximum 3 =>> "+max3+"\n");
	}
    public static void main(String[] args) {
        // TODO code application logic here
        int choice =0;
        do
            {
            
            System.out.println("Please Enter size of arr: ");
            int sz;
            Scanner in = new Scanner(System.in);
            sz = in.nextInt();
            char arr [] = new char[sz];
            System.out.println("Enter array elements");
        for (int i = 0 ; i<sz; ++i){
            char c = in.next().charAt(0);
            arr[i] = c;
        }
            System.out.println("1  - most repeated value");
            System.out.println("2  - sort");
            System.out.println("3  - shuffle");
            System.out.println("4  - Find the Largest Prime");
            System.out.println("5  - Find ths smallest Prime");
            System.out.println("6  - Check Palindrome");
            System.out.println("7  - Check sorted");
            System.out.println("8  - Count Primes");
            System.out.println("9  - Reverse array");
            System.out.println("10 - Shift array");
            System.out.println("11 - Distinct array");
            System.out.println("12 - Get the maximum 3 numbers");
            System.out.println("13 - Get the minimum 3 numbers");
            System.out.println("14 - Get average");
            System.out.println("15 - Get median");
            System.out.println("16 - Return only primes");
            System.out.println("17 - Zero if less than zero");
            System.out.println("18 - Execute all functions");
            System.out.println("0  - to exit");
            System.out.println("Enter your choice");
        choice = in.nextInt();
        
        switch(choice)
            {
                case 0:
                    break;
                case 1:
                {
                     // call your func. here
                    most_repeated(arr);

                    break;
                }case 2:
                {
                    // call your func. here
                    break;
                }case 3:
                {
                    // call your func. here
                    break;
                }case 4:
                {
                    // call your func. here
  
		break;
                }case 5:
                {
                    // call your func. here
                    break;
                }
                case 6:
                {
                    // call your func. here
                    Shift_Array(arr); 
                    break;
                }
                
	case 13:
            {
             maximum3Elements(arr);
              break;
            }
          case 14:
            {
             Get_Average(arr);
              break;
            }
                case 15:
                {
                    getMedian(arr);
                    break;
                }

           case 16:
                {
                	prime_num(arr);
                    break;
                }
          case 18:
                {
                 maximum3Elements(arr);
                  most_repeated(arr);
                  prime_num(arr);
                  Get_Average(arr);
                  Shift_Array(arr);
                  break;
                
            }
        }
            
        }while(choice != 0);
    }
    
        //20160204 Shift Array
    public static void Shift_Array(char arr[])
    {
        //Mohamed Reda
        //20160204
        char first = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
       arr[arr.length-1]=first;
       String s = "";
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i] +"";
            
        }
       System.out.println("The Shifted array is: " + s);
    }

    



 public static void Get_Average(char arr[])
    {
       //Ahmed Yassin
        //20160041
       double sum=0;
      double v=0;
       for(int i=0;i<arr.length;i++)
           sum+=Character.getNumericValue(arr[i]);
          v=sum/arr.length;
       System.out.println(" Average = " +v);
    
    }
    public static void most_repeated(char[]x)
    {
        int count=0;
        int a=0;
        char greater='0';
        for(int q=0;q<x.length;q++)
        {
        for(int j=0;j<x.length;j++)
        {
        if(x[q]==x[j])
         {count++;}
       }
       if(count>a)
       { a=count;
         greater=x[q];
       }count=0;
           }
        System.out.println("The most repeated value is: "+greater);

    
    }
}
