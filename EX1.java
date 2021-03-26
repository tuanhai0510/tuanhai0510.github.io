import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class EX1 {
    public static void main (String[] args) {
        //Lay kich thuoc cua chuoi
        String ex = "Bai tap so 1";
        System.out.println("kich thuoc cua chuoi la: "+ex.length());

        //Lay ngay va gio hien tai
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm\ndd/MM/yyyy");
        String dateFormat = currentDateTime.format(dateTimeFormatter);
        System.out.println(dateFormat);

        //So sanh 2 chuoi
        String ex1 = "exercise";
        String ex2 = "EXERCISE";
        System.out.println(ex1.equals(ex2));
        System.out.println(ex1.equalsIgnoreCase(ex2));
    }        
    
}       