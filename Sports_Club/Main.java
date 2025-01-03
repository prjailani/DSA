 public class Main {
    public static void main(String[] args) {
        boolean hasCertificate = true;
        boolean hasacademic = false;
        boolean attendedsportsevent = false;

        if (hasCertificate || hasacademic || attendedsportsevent) {
            System.out.println("eligible");
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
