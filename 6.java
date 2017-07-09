class SumOfNumbers
{
    public static void main(String arg[])
    {
        int input = 6;
        int sum = 0;
        
        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;    // LINE A
            System.out.println("Sum after adding " + i + " is : " + sum); 
        }
        
        System.out.println();
        System.out.println("Sum of numbers till " + input + " is " + sum); // LINE B
    
    }
}

OUTPUT
Sum after adding 1 is : 1
Sum after adding 2 is : 3
Sum after adding 3 is : 6
Sum after adding 4 is : 10
Sum after adding 5 is : 15
Sum after adding 6 is : 21

Sum of numbers till 6 is 21
