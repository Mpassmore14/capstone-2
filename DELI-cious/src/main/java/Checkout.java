import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class Checkout {

LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd_hh-mm-ss");
String fileName = "Receipts - " + now.format(formatter) + ".txt";

FileWriter writer = new FileWriter(fileName);


    public Checkout() throws IOException {
        writer.write(Order);
        writer.close();
        System.out.println(" Receipt saved as: " + fileName);
    }
}
