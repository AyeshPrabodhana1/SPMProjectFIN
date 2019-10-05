/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codecompleproject;


public class NewClass1 {
   public static int counterSetValue = 0;
    public static int countersetManyValues = 0;
    public static int counterGetValue = 0;
    public static int counter4 = 0;

  
    public static int setValue() {

        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        System.out.println("Name of current method: "
                + nameofCurrMethod);
        counterSetValue++;
        System.out.println("counterSetValue: " + counterSetValue);
        return counterSetValue;

    }

    // method name getValue 
    public static int getValue() {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        System.out.println("Name of current method: "
                + nameofCurrMethod);
        // System.out.println("getValue"); 
        counterGetValue++;
        System.out.println("counterGetValue: " + counterGetValue);
        return counterGetValue;

    }

    // method name setManyValues 
    public static int setManyValues() {
        String nameofCurrMethod = new Throwable()
                .getStackTrace()[0]
                .getMethodName();

        System.out.println("Name of current method: "
                + nameofCurrMethod);
        // System.out.println("getValue"); 
        countersetManyValues++;
        System.out.println("countersetManyValues: " + countersetManyValues);

        getValue();
        getValue();
        return countersetManyValues;
       
    } 
}
