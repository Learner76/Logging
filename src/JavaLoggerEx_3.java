//Addign a timestamp in file name to avoid overwriting in each execution.



import java.time.LocalDate;
import java.time.LocalTime;

import java.time.temporal.ChronoUnit;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Basic program to write in a file in current directory.
// Adding filehandler to log and adding SimpleFormatter.
public class JavaLoggerEx_3  {

    public static void main(String [] args) throws Exception{

        Logger mylogs = Logger.getLogger("mylogs");

        FileHandler file = new FileHandler("./"+uniquename("mylogs"));

        file.setFormatter(new SimpleFormatter());

        mylogs.addHandler(file);

        mylogs.log(Level.INFO,"This is a information message");
        mylogs.log(Level.WARNING,"This is a warning message");
        mylogs.log(Level.SEVERE,"This is a failure message");

    }

    public static String uniquename(String logname){
        String Date = LocalDate.now().toString();
        String time =LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString().replace(":","-");
        logname =logname+"_"+Date+time+".log";
        return logname;
    }

}
