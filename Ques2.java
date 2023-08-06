//Write a program to create an object of an class which contain a method and call that class method in
//main method.
public class Ques2 {

    int x= 20;   //instance variable store in heap memory
    int y;

    public int mult(int a , int b)
    {
        int result = a*b;
        return result;
    }
    public static void main(String[] args) {
        Ques2 obj = new Ques2();
        int result = obj.mult(5, 10);
        System.out.println(result);
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
