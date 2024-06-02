package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;
import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyEventDateComparator extends MyEventComparator {

    @Override
    public int compare(Event e1, Event e2) {
        //compares 2 events by date; handles null arguments, a null event is always smaller
        //than any non-null event.
        SimpleDateFormat d1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat d2 = new SimpleDateFormat("dd.MM.yyyy");

        Date date1 = e1.getDate();
        Date date2 = e2.getDate();

        if(date1 == null && date2 == null) {
            return 0;
        }
        else {
            return date1.compareTo(date2);
        }
    }
}
