package week1;
public class variableclass {
    /*Instance variable
     * Need object to acess
     * Not shared in multiple object
     */
    int instancevariable =10;
    /* Static variable
     * No need object ,can be accesed using class
     * shared in multiple object
     */
    static int staticvariable =100;
    public static void main(String[] args) {
        /* Non primitive Data Types */
        /*Declaration */
        byte bytevariable;
        /*Initialization */
        bytevariable =100;
        /* Declaration and Initialization */
        short shortvariable = 100;
        /*Multiple Declaration */
        int intvariable1, intvariable2;
        /*Intialization */
        intvariable1 =10;
        intvariable2 =-10;
        /*Multiple Declaration and Initialization */
        long longvariable1=100000; longVariable2=-199999;
        /*Intialization */
        longvariable1=100000; longVariable2=-199999;
        float floatvariable =1.89f;//the letter 'f' is required
        double doublevariable =189.8923d; //the letter 'd' is optional
        char charvariable ='c';// single letter enclosed in single quotiation
        boolean boolenvariable = true ;//small case true/false
        /*llegal action  */
        //byte bytevariable=20;//cannot redeclare a variable
        //bytevariable =30//insteasd use reassignment
        //boolean boolvar2='false';//should match the exact datatype
        //byte bytevariable2=1000000;//cannot exceed main or max

        /*Non-primitive data type */
        String  stringvariable = "the is a string";//use double quotiation"""
            /*or use the class */
            String stringvariable2 = new String("string using class");
            /*class/object */
            variableclass variableobject = new  variableclass();
            /*use the same class Name as specified in public class <ClassName */
            /*Need object to acces instance variable */
            System .out.println(variableObject.instancevariable);
            /*can access static variable with class only /no object needed */
            System.out.println(variableclass.staticvariable);

            /*Type casting */
            int intvariableconvert =10;
            double intvariableconvertvariable = intvariableconvert;
            /*Explicit casting */
            double doublevariableconvert=100.29;
            int doublevariableconvertTolnt =(int) doublevariableconvert;

    }
    
}
