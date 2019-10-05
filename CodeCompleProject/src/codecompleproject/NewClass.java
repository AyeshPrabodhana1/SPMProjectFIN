/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codecompleproject;




public class NewClass {
     
    public static int counterSetValue = 0;
     public int printMesage() 
    { 
         String nameofCurrMethod = new Throwable() //get array of stacktrace elements
                                      .getStackTrace()[0] //get the current method name at 0th index
                                      .getMethodName(); 
  
        System.out.println("Name of current method: "
            + nameofCurrMethod);
        counterSetValue++;
        System.out.println("counterSetValue: "+ counterSetValue); 
        
        return counterSetValue; 
    } 
  
  

}


