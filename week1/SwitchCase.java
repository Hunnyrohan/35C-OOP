package week1;

public class SwitchCase {
    public static void main(String[] args) {
        char value = 'a';
        switch(value){
            case 'a':
              //Nested Switch
              switch(numVal){
                case 10:
                System.out.println("10");
                break;
                default:
                System.out.println("Default");
                break;
              }
                 System.out.println("Apple");
                 break;
            case 'b':
                 System.out.println("Ball");
                 break;
            case 'c':
                 System.out.println("cat");
                 break;
            case 'd':
                 System.out.println("Dog");
                 break;
            default:
                System.out.println("No word found");
            
        }
    }
    

}



/*Task
 * Consider the variable week in int
 * if the value is 
 * 0 - print sunday
 * 1 - print Monday
 * 2 - print Tuesday
 * 3- print Wednesday
 * 4 - print Thrusady
 * 5- print Friday
 * 6- print saturday
 * if the value is other than these print lnvalid week
 */


 public class SwitchCase {
    public static void main(String[] args) {
        int weekday = 3;

        switch (weekday) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Week");
        }
    }
}