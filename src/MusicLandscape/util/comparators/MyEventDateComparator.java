package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventDateComparator extends MyEventComparator {

    @Override
    public int compare(Event e1, Event e2) {
        //compares 2 events by date; handles null arguments, a null event is always smaller
        //than any non-null event.
        if (e1 == null && e2 == null) {
            return 0; // Both are null, they are equal
        }
        else if (e1 == null && e2 != null) {
            return -1; // e1 is null and e2 is not null, e1 is smaller
        }
        else if (e2 == null && e1 != null) {
            return 1; // e2 is null and e1 is not null, e2 is smaller
        }
        // Both e1 and e2 are not null, so compare their dates
        else if (e1.getDate() == null && e2.getDate() == null) {
            return 0; // Both dates are null
        }
        else if (e1.getDate() == null) {
            return -1; // e1's date is null and e2's date is not null, e1's date is considered smaller
        }
        else if (e2.getDate() == null) {
            return 1; // e2's date is null and e1's date is not null, e2's date is considered smaller
        }
        else if(e1.getDate().equals(e2.getDate())){
            return 1;
        }
        else
        {   // Use compareTo to compare the dates
            return e1.getDate().compareTo(e2.getDate());
        }
    }
}
