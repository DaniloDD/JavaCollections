package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Static {
    // Static field
    static int staticCounter = 0;

    // Instance field
    int instanceCounter = 0;

    // Static method
    public static void incrementStaticCounter() {
        staticCounter++;
    }

    // Instance method
    public void incrementInstanceCounter() {
        instanceCounter++;
    }

    public static void main(String[] args) {
        // Accessing static field and method without creating an instance
        System.out.println("Initial static counter: " + JavaQ_Static.staticCounter);
        JavaQ_Static.incrementStaticCounter();
        System.out.println("Static counter after increment: " + JavaQ_Static.staticCounter);

        // Creating instances of the class
        JavaQ_Static example1 = new JavaQ_Static();
        JavaQ_Static example2 = new JavaQ_Static();

        // Accessing instance fields and methods
        example1.incrementInstanceCounter();
        example2.incrementInstanceCounter();
        example2.incrementInstanceCounter();

        System.out.println("Instance counter for example1: " + example1.instanceCounter);
        System.out.println("Instance counter for example2: " + example2.instanceCounter);

        // Static counter is shared between instances
        System.out.println("Static counter after all increments: " + JavaQ_Static.staticCounter);
    }
}
