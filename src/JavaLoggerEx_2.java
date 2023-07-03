import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Basic program to write in a file in current directory.
// Adding filehandler to log and adding SimpleFormatter.
public class JavaLoggerEx_2  {

    public static void main(String [] args) throws Exception{
        Logger mylogs = Logger.getLogger("mylogs");

        FileHandler file = new FileHandler("./mylogsfile.log");

        file.setFormatter(new SimpleFormatter());

        mylogs.addHandler(file);

        mylogs.log(Level.INFO,"This is a information message");
        mylogs.log(Level.WARNING,"This is a warning message");
        mylogs.log(Level.SEVERE,"This is a failure message");
    }

}
