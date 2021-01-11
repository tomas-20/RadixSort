public class Radix {
  private static double log10 = Math.log(10);
  public static int nth(int n, int col) {
    return n / (int) Math.pow(10, col) % 10;
  }
  public static int length(int n) {
    return (int) (Math.log(n) / log10);
  }
  public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i ++) {
      original.extend(buckets[i]);
    }
  }
}
