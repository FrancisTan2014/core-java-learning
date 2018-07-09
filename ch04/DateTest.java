import java.time.LocalDate;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        int year = date.getYear();
        System.out.printf("This year is %d", year);

        LocalDate deadline = LocalDate.now().plusYears(70);
        int deadYear = deadline.getYear();
        System.out.printf("Dead year is %d", deadYear);
    }

}