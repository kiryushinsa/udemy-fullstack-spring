import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MakeInterval {

    MakeInterval()
    {
        try {

            FileReader file = new FileReader("input.txt");
            BufferedReader reader = new BufferedReader(file);

            String interval = reader.readLine();


            //  System.out.println(interval);

            if(interval.equals("WEEK") ){
                System.out.println("W");
                weekInterval(reader.readLine());
            }
            else if(interval.equals("MONTH")){
                System.out.println("M");
            }
            else if (interval.equals("QUARTER")){
                System.out.println("Q");
            }
            else if (interval.equals("YEAR")){
                System.out.println("Y");
            }
            else if (interval.equals( "FRIDAY_THE_13TH")){
                System.out.println("F");
            }
            else System.out.println("NO AFFECTED ROWS");


            } catch (
        IOException | ParseException e){
            e.printStackTrace();
        }
    }

    public void weekInterval(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.FRANCE);
        LocalDate data = LocalDate.parse(date);
        Calendar cal = new GregorianCalendar(data.getYear(),data.getMonth().getValue()-1,data.getDayOfMonth());


        cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        System.out.println(cal.getTime());

        cal.set(Calendar.DAY_OF_WEEK,5);
        System.out.println(cal.getTime());

    }
}
