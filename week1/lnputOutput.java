package week1;
import java.util.Scanner;
//or
// import java,utill,*;//import all the utils
public class lnputOutput {
    public static void main(String[] args) {
        /*print/output a line with line break
         * use "sout" shortcut
         */
        System.out.println("This prints and break line");
        /*print the word without line break */
        System.out.print("This will not break line");
        System.out.print("This line will conmtinue\n");

        /*output formating
         * System.out.printf();
         * %s string,%d integral,%f floating point,%b boolean
         * This will not break line too
         */
        System.out.printf("The next word is %s","New word");
        System.out.printf("the next int is %d",10);
        /*you can use multiple formatter */
        System.out.printf("Multiple %f %b",10.9f, false);

        /* User lnput using Scanner
         * first import the scanner class
         * import java.utill,scanner;//at the top of the file 
         */
        Scanner scan = new Scanner(System.in);//System.in is used as input
        System.out.println("The following takes one word from sentence");
        String oneWord = scan.next();
        System.out.println(oneWord);
        System.out.println("The following takes whole sentence");
        String wholeSentence = scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("The following takes int");
        int intInput = scan.nextInt();
        System.out.println(intInput);

        System.out.println("The following takes boolen");
        boolean booleanlnput = scan.nextBoolean();
        System.out.println(booleanlnput);
        scan.close();
    }
    
}
