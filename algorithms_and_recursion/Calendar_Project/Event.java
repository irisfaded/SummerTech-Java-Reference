package Calendar_Project;

public class Event {
    private String type;
    private String name;
    private String startTime;
    private String endTime;

    public Event(String name, String type, String startTime, String endTime) {
        this.name = name;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getEventInformation() {
        return (name + "\n" + type + "\nstart time: " + startTime +" \nend time: " + endTime);
    }
}

