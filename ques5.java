//Write a Java program to print an entire array?
import java.util.Scanner;
public class ques5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter the elements in an array: ");
        for(int i=0; i<size ;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Your array is: ");
        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
}
