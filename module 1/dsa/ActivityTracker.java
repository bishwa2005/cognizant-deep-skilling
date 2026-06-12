class Activity {

    int activityId;
    String activityName;
    String currentState;

    Activity(int activityId,
             String activityName,
             String currentState) {

        this.activityId = activityId;
        this.activityName = activityName;
        this.currentState = currentState;
    }
}

class Link {

    Activity details;
    Link nextLink;

    Link(Activity details) {
        this.details = details;
    }
}

public class ActivityTracker {

    Link first;

    void append(Activity job) {

        Link fresh = new Link(job);

        if(first == null) {
            first = fresh;
            return;
        }

        Link cursor = first;

        while(cursor.nextLink != null)
            cursor = cursor.nextLink;

        cursor.nextLink = fresh;
    }

    void printList() {

        Link cursor = first;

        while(cursor != null) {

            System.out.println(
                cursor.details.activityName);

            cursor = cursor.nextLink;
        }
    }
}