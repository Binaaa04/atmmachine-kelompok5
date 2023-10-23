/**
 * ExampleOperator20
 */
public class ExampleOperator20 {

public static void main(String[] args) {
 int x = 10;
 System.out.println("Initial value of x = " + x );
 System.out.println("x++ = " + x++);
 System.out.println("After Evaluation, x = " + x);
 x = 10;
 System.out.println("Initial value of x = " + x);
 System.out.println("++x =" + ++x);
 System.out.println("After Evaluation, x = " + x );
 int y = 12;
 System.out.println(x > y || y == x && y <=x );
 int z = x ^ y;
 System.out.println("The results of x ^ y is " +z);
 z %= 2;
 System.out.println("The fiinal results is" +z);

}   
}