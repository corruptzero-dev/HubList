package task;


public class Main {

    public static void main(String[] args) {
        HubList<String> hub = new HubList<>();
        hub.add("1st");
        hub.add("6th....");
        hub.add("5th...");
        hub.add("thisWillBeDeleted");
        hub.add("4th...");
        hub.add("2nd.");
        hub.add("3rd..");
        hub.print();
        System.out.println();
        System.out.println("'2nd.' pos: " + hub.find("2nd."));
        System.out.println();
        System.out.println("Deleted item " + hub.removeAt(3));
        hub.print();
        hub.add("hi");
        System.out.println();
        hub.print();
        System.out.println();
        System.out.println("'hi' pos: " + hub.find("hi"));
        HubComparator comp = new HubComparator();
        hub.sort(comp);
        System.out.println();
        System.out.print("Sorted array: ");
        hub.print();
    }
}