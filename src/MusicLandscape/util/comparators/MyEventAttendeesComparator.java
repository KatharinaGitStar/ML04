package MusicLandscape.util.comparators;

import MusicLandscape.entities.Event;

public class MyEventAttendeesComparator extends MyEventComparator{
    @Override
    public int compare(Event e1, Event e2) {
        //compares two events by # of attendees; null-argument: 2 null are equal; any null is always smaller

        if(e1.getAttendees() == e2.getAttendees()) {
            return 0;
        }
        else if(e1.getAttendees() < e2.getAttendees()) {
            return (e2.getAttendees()-e1.getAttendees());
        }
        else if(e1.getAttendees() > e2.getAttendees()) {
            return (e1.getAttendees()-e2.getAttendees());
        }
        return 0;
    }
}
