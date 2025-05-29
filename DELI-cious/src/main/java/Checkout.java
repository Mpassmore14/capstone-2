import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class Checkout {

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_hh-mm-ss");
    String fileName = "Receipts - " + now.format(formatter) + ".txt";


    public void Checkout() {
        try {
            FileWriter writer = new FileWriter(fileName);
//            writer.write(Order);
            writer.close();
            System.out.println(" Receipt saved as: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}