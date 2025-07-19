package Calendar_Project;

public class Day {
    private String dow; // day of week
    private int dom; // day of month
    private Event[] events;

    public Day(String dow, int dom) {
        this.dow = dow;
        this.dom = dom;
        this.events = new Event[100];
    }

    public int getDayOfMonth() {
        return dom;
    }
    public String getDayOfWeek() {
        return dow;
    }

    public void createEvent(Event newEvent) {
        for(int i =0; i<events.length; i++) {
            if(events[i] == null) {
                events[i] = newEvent;
                break;
            }
        }
    }
    public void listEvents() {
        int count = 1;
        for(Event e: events) {
            if(e != null) {
                System.out.println(count + ". " + e.getEventInformation());
                count++;
            } else {
                break;
            }
        }
        if(count ==1) {
            System.out.println("This day has no events.");
        }
    }
    public void removeEvent(int eventIndex) {
        eventIndex = eventIndex-1;
        for(int i =0; i<events.length; i++) {
            if(i == eventIndex) {
                events[i] = null;
                break;
            }
        }
    }

}
