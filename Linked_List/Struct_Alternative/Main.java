class Aftaf{
    int val1;
    int val2;
    int val3;
}
// New Test Datatype with the size of 12 bytes (similar to struct in C)

public class Main {
    public static void main(String[] args) {
    Aftaf aftaf = new Aftaf();
    // . means relation
    aftaf.val1 = 12;
    aftaf.val2 = 23;
    aftaf.val3 = 56;

    System.out.println(aftaf.val1);
    System.out.println(aftaf.val2);
    System.out.println(aftaf.val3);
    }
}
