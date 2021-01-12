public class Test {
  private static int random() {
    return (int) (Math.random() * 10);
  }
  public static void main(String[] args) {
    System.out.println(Radix.nth(2187, 2));
    System.out.println(Radix.length(2187));
    System.out.println(Radix.length(32457689));
    MyLinkedList[] bob = new MyLinkedList[10];
    for (int i = 0; i < 10; i ++) {
      MyLinkedList current = new MyLinkedList();
      int limit = random();
      for (int j = 0; j < limit; j ++) {
        current.add(Integer.toString(random()));
      }
      System.out.println(current);
      bob[i] = current;
    }
    MyLinkedList joe = new MyLinkedList();
    Radix.merge(joe, bob);
    System.out.println(joe);
  }
}
