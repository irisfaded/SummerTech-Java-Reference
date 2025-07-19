package Calendar_Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Day[][] calendar = new Day[4][7];
        int day_count = 1;
        // list out calendar
        for(int i = 0; i<=calendar.length-1; i++) {
            for(int j = 0; j<=calendar[i].length-1; j++) {
                if(j == 0) {
                    calendar[i][j] = new Day("Monday", day_count);
                } else if (j == 1) {
                    calendar[i][j] = new Day("Tuesday", day_count);
                } else if (j==2) {
                    calendar[i][j] = new Day("Wednesday", day_count);
                } else if (j==3) {
                    calendar[i][j] = new Day("Thursday", day_count);
                } else if (j==4) {
                    calendar[i][j] = new Day("Friday", day_count);
                } else if (j==5) {
                    calendar[i][j] = new Day("Saturday", day_count);
                } else if (j == 6) {
                    calendar[i][j] = new Day("Sunday", day_count);
                }
                day_count++;
            }
        }
        // print created calendar
        printCalendar(calendar);
        while(true) {
            System.out.println("----------------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like to do? ");
            System.out.println("1. Create an event \n2. Remove an event \n3. View events on a day");
            int choice = scan.nextInt();
            System.out.println("Please enter a day.");
            int day = scan.nextInt();
            Day dayToEdit = findDay(day, calendar);
            if(dayToEdit == null) {
                System.out.println("Not a valid day.");
            }
            if(choice == 1) {
                addEvent(dayToEdit);
            } else if(choice == 2) {
                removeEvent(dayToEdit);
            } else if (choice == 3) {
                dayToEdit.listEvents();
            }


        }

    }
    public static void printCalendar(Day[][] calendar) {
        for(Day[] week : calendar){
            for(Day day : week) {
                System.out.print(day.getDayOfMonth() + " ");
//                System.out.print(day.getDayOfWeek() + " ");
            }
            System.out.println();
        }
    }

    public static Day findDay(int dom, Day[][] calendar) {
        for(Day[] week : calendar){
            for(Day day : week) {
                if(day.getDayOfMonth() == dom) {
                    return day;
                }
            }
        }
        return null;
    }

    public static void addEvent(Day day) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name your event: ");
        String name = scan.nextLine();
        System.out.println("Type of event: ");
        String type = scan.nextLine();
        System.out.println("Start time (24hr format): ");
        String start = scan.nextLine();
        System.out.println("End time (24hr format): ");
        String end = scan.nextLine();
        day.createEvent(new Event(name, type, start, end));
        System.out.println("Successfully added new event.");
    }

    public static void removeEvent(Day day) {
        day.listEvents();
        Scanner scan = new Scanner(System.in);
        System.out.println("Which event would you like to remove?");
        int eventToRemove = scan.nextInt();
        day.removeEvent(eventToRemove);
        System.out.println("Successfully removed event.");
    }
}
