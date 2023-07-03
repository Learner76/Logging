//Logging with Java provide logging package.
//Basic program to create a logger and print on console.


import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaLoggerEx_1 {

   public static void main (String [] args ){

       Logger mylogger = Logger.getLogger("mylogger");   //Provides a logger names mylogger for you.

       mylogger.log(Level.INFO, "This is a information message");
       mylogger.log(Level.WARNING,"This is a warnign message");
       mylogger.log(Level.SEVERE,"This is a failure");

       //Default it will write in string formate and on console
   }

}
