package smcgovern2.dates;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Date joshuaTree = new GregorianCalendar(1987,3,9).getTime();
        Date rattleAndHum = new GregorianCalendar(1988,10,10).getTime();
        Date today = new Date();
        Long joshuaRattleDiff = rattleAndHum.getTime() - joshuaTree.getTime();
        Long joshuaTodayDiff = today.getTime()-joshuaTree.getTime();
        Long rattleTodayTime = today.getTime()+joshuaRattleDiff;

        Date sumDate = new Date(rattleTodayTime);
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        System.out.println("It has been " + (joshuaTodayDiff / (1000 * 60 * 60 * 24)) + " days since joshua tree");
        System.out.println("Rattle and hum would come out on " + dateFormatter.format(sumDate.getTime()));




    }
}
