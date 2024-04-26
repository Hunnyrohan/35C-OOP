package week1;
public class OperatorClass {
    public static void main(String[] args) {
        /*Arithimetic Operation */
        int a = 10 ,b=20;
        int sum = a+b; //here is an arithmetic Operation
        System.out.println("The sum is " + sum);

        System.out.println("The difference is "+(a-b));
        System.out.println("The multiplication is "+(a*b));
        System.out.println("The division is "+(a/b));
        System.err.println("The modulo is " +(a%b));

        /*Assignment operator */
        /*Delecration and assignment */
        int number1 = 10;
        int number2;
        /*Assignment after declaration */
        number2 =20;
        /*Assign value using += */
        System.out.println("Number2 after using += is " +(number2 +=10));
        /*Assign using *= */
        number2 *= 100; //This is same as doing number2=number2 *10
        System.out.println("Number2  after using *= is " +number2);


        /*Relation Operation */
        int rNumber1 =9 ,rNumber2 =20;
        System.out.println("ls rNumber1 equals to rNumber2 ?" +(rNumber1 == rNumber2));
        System.out.println("ls rNumber1 less than rNumber2 ?" +(rNumber1 < rNumber2));
        System.out.println("ls rNumber1 greater or equal to rNumber2 ?" +(rNumber1>=rNumber2));
        System.out.println("ls rNumber and rNumber2 not equal to rNumber2?" +(rNumber1!=rNumber2));

        /* Logical operator */
        int lNumber1=20,lNumber2=22;
        boolean expression1 =lNumber1 ==lNumber2;
        boolean expression2 =lNumber2 >lNumber2;
        System.out.println("And expression using && " +(expression1 && expression2));
        System.out.println("Or expression using || " +(expression1 || expression2));
        System.out.println("Not expression using !" + (!expression1));


        /*Unary Operator */
        int uNumber1 =10;
        uNumber1 ++; //same as uNumber1=uNumber1 +1;
        System.out.println("Unary Operator using ++ " + uNumber1);
        uNumber1 --;//same as uNumber1 = uNumber1 -1;
        System.out.println("Unary Opertor using --" + uNumber1);
        
        /* Ternary Opertor */
        int tNumber1=20, tNumber2=20;
        boolean tExpression1 =tNumber1 ==tNumber2;
        /*For ternary,First you define expression,if expression is true
         * it return value after "?"
         * if the expression is false
         * it return the value after ":"
         * syntax
         * expression ? true ststement : false statement
         */
        String output =tExpression1 ?"Tre Condition":"False Condition";
        /* Further be seen as
         * String output;
         * if(tExpression1){
         * }else{
         * output ="True Condition";
         * }else{
         * output ="False Condition";
         * }
         */
        int numberOutput =tNumber2 > tNumber2 ? 10: 20;
        System.out.println(output);

        /*Task1 
         * Write a program to print weather a variable is greater or equal to 18
         * 
         */
        /*Task2
         * write a program to print simple interest from variables
         * Make 3 variable for amount ,time and rate and save the calculation into a variable
         * Formula:
         * si = amount * time *rate/100;
         */

         /*Task 3
          * write a program to print the area and perimeter of rectangle
          *a=l*b
          *p=2(l+b)
          */

          /*Task 4
           * complete the task 1 using ternary operators
           */


    }
    
}
