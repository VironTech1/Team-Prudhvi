package PackageMeeting;
import java.util.ArrayList;
import java.util.List;
class Mad1 
{
    String name;
    String phone;
    String address;

    // constructor for Participant
    public Mad1(String name, String phone, String address) 
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}

class Meeting 
{
    String url;
    int time;
    String host;
    List<Mad1> participants;

    // constructor for Meeting
    public Meeting(String url, int time, String host, List<Mad1> participants) 
    {
        this.url = url;
        this.time = time;
        this.host = host;
        this.participants = participants;
    }
}

public class Mad 
{
    public static void main(String[] args) 
    {
        // Create participants
        Mad1 participant1 = new Mad1("John Doe", "123-456-7890", "123 Main St");
        Mad1 participant2 = new Mad1("Jane Doe", "987-654-3210", "456 Oak St");

        // Create a list of participants
        List<Mad1> participantsList = new ArrayList<>();
        participantsList.add(participant1);
        participantsList.add(participant2);

        // Create a meeting
        Meeting meeting = new Meeting("https://stephensmeeting", 120, "Stephen", participantsList);

        // Accessing meeting properties
        System.out.println("Meeting URL: " + meeting.url);
        System.out.println("Meeting Time: " + meeting.time + " minutes");
        System.out.println("Meeting Host: " + meeting.host);

        // Accessing participant properties
        for (Mad1 participant : meeting.participants) 
        {
            System.out.println("Participant Name: " + participant.name);
            System.out.println("Participant Phone: " + participant.phone);
            System.out.println("Participant Address: " + participant.address);
        }
    }
}
