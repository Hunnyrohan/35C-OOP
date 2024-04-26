 package week1;

// public class lfStatement {
//     public static void main(String[] args) {
//         /*simple if statement,takes condition/expression with boolean value */
//         if (true){
//             System.out.println("True statement");
//         }
//         if(false){
//             System.out.println("Skipped statement");
//         }else{
//             System.out.println("False ststement");
//         }
//         /*lf condition fails,goes to else block/scope */
//         int num1 =10,num2 =20;
//         if(num1 > num2){
//             System.out.println("Num1 is greater");
//         }else{
//             System.out.println("Num2 is greater");
//         }
//         /*if else if */
//         int iNum1 = 10, iNum2 = 10;
//         if (iNum1 == iNum2){
//             System.out.println("Equal number");
//         }else if(iNum1 > iNum2){
//             System.out.println("iNum1 is greater");
//         }else{
//             System.out.println("iNum2 is greater");
//         }
//         /*Not that else should be at least of the  if statement */
//         /*lf Else if ladder, more that one else if  */
//         if(iNum1 < 0){
//             System.out.println("iNum2 is negative");
//         }else if (iNum2 < 0){
//             System.out.println("iNum is negative");
//         }else if (iNum1 == iNum2){
//             System.out.println("Equal numnber");
//         }else if(iNum1 < iNum2){
//             System.out.println("iNum1 is less");
//         }else{
//             System.out.println("Default execution if all fails");
//         }
//         /* Nested if statement */
//         int nNum1 = -10, nNum2 = 20;
//         if(nNum1 < 0){
//             if(nNum1 > nNum2){
//                 System.out.println("nNum1 is negartive and greater");
//             }
//         }else{
//             if(nNum1 > nNum2){
//                 System.out.print("nNum1 is positive and greater");
//             }else{
//                 System.out.println("nNum1 is positive and lesser");
//             }
//         }
//     }
//     /*Task
//      * Given the value below ,add the total and take the average 
//      * if any of the marking is less than 35, print"Fail"
//      * if average is less than 60, print"3rd div"
//      * if average is less than 70, print"2nd div"
//      * if average is less than 80, print"1st div"
//      * if average is less than  or equal to 80, print"distintion"
//      */
//     int math = 38, science = 60 ,english =35;
//     /*make total variable and average variable */

// }

public class lfStatement {
    public static void main(String[] args) {
        // Variables for the subject marks
        int maths = 38;
        int science = 60;
        int english = 35;

        // Calculate total and average
        int total = maths + science + english;
        double average = total / 3.0;

        // Check for any failing marks
        if (maths < 35 || science < 35 || english < 35) {
            System.out.println("Fail");
        } else {
            // Determine the division based on the average
            if (average < 60) {
                System.out.println("3rd div");
            } else if (average < 70) {
                System.out.println("2nd div");
            } else if (average < 80) {
                System.out.println("1st div");
            } else {
                System.out.println("Distinction");
            }
        }
    }
}
    
 












