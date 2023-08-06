//Write a Java program to find the index of a specific element in an integer array.?
import java.util.Scanner;
public class ques4 {

    public static void main(String[] args) {
        //int nums[]= {5,3,2,1,6};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size= scan.nextInt();

        int arr[]= new int[size];

        System.out.print("Enter the elements in an array: ");
        for(int i=0; i<size;i++)
        {
            arr[i] = scan.nextInt();
        }

        //print the array
        for(int a: arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        //search the target array
        System.out.print("Enter the element to search for: ");
        int target = scan.nextInt();

        int index=findIndex(arr , target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        //scanner.close();
    }

    // Method to find the index of an element in an array
    public static int findIndex(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }

        
    }

