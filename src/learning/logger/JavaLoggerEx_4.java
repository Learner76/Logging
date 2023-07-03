//Create a global logger and use it in other classes.
// Static block is used to initialise the static variable.Advantage is, whenever another
// class access any static variable or method. Static will be execute first.
// Alternate is to create a method but then user has to call method each time,
// with static variable we can just access variable, no need to call method.

package learning.logger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class JavaLoggerEx_4 {
    public static Logger mylogs;

    static {
     mylogs = Logger.getLogger("mylogs");

     String Date = LocalDate.now().toString();
     String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString().replace(":","-");
     String logfilename = "mylogs"+Date+"-"+time+".log";

     FileHandler file = null;
        try {
         file = new FileHandler("./"+logfilename+".log");}
     catch (Exception e){ e.printStackTrace(); }
     SimpleFormatter format = new SimpleFormatter();
     file.setFormatter(format);

     mylogs.addHandler(file);
    }

    public static void main(String [] args){
        mylogs.log(Level.INFO,"This is information");
    }
}
