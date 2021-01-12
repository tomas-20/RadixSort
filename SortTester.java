public class SortTester {
  public static void main(String[] args) {
    SortableLinkedList bob = new SortableLinkedList();
    for (int i = 0; i < args.length; i ++) {
      bob.add(Integer.parseInt(args[i]));
    }
    Radix.radixSortSimple(bob);
    System.out.println(bob);
  }
}
