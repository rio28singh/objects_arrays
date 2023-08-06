//Write a program to demonstrate method overloading with 3 different parameters.
public class overloading {

    public int add(int a , int b)
    {
        int result = a+b;
        return result;
    }
    public int add(int a, int b , int c)
    {
        int result =a+b+c;
        return result;
    }
    public double add(double a , double b)
    {
        double result =a+b;
        return result;
    }
    public static void main(String[] args) {
        overloading t = new overloading();
        int res1 = t.add(10, 5);
        int res2 = t.add(15, 50, 10);
        double res3 = t.add(10.5, 10.5);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
