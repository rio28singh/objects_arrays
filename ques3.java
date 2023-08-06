//Write a Java program to calculate the sum of all elements in an integer array?

public class ques3 {
    public static void main(String[] args) {
        //int nums[]= new int[4]; 
        int nums[]={5, 2 , 3 , 5};
        int sum=0;
        for(int n : nums)
        {
            sum+=n;
        }
        System.out.println(sum +" ");
    }    
}
