public class App
{
    public static void main(String[] args) {
        
        QueueSystem queueSystem = QueueSystem.getInstance();

        
        System.out.println("Help Desk 1 serves number: " + queueSystem.getNextQueueNumber());
        System.out.println("Help Desk 2 serves number: " + queueSystem.getNextQueueNumber());
        System.out.println("Help Desk 3 serves number: " + queueSystem.getNextQueueNumber());

        queueSystem.resetQueue(1);

        System.out.println("Help Desk 1 serves number: " + queueSystem.getNextQueueNumber());
        System.out.println("Help Desk 2 serves number: " + queueSystem.getNextQueueNumber());
        System.out.println("Help Desk 3 serves number: " + queueSystem.getNextQueueNumber());

        System.out.println("Current queue number in the system: " + queueSystem.getCurrentQueueNumber());
    }
}
