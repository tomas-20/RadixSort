public class Radix {
  private static double log10 = Math.log(10);
  public static int nth(int n, int col) {
    return n / (int) Math.pow(10, col) % 10;
  }
  public static int length(int n) {
    return (int) (Math.log(n) / log10) + 1;
  }
  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
    for (int i = 0; i < buckets.length; i ++) {
      original.extend(buckets[i]);
    }
  }
  private static SortableLinkedList[] getBuckets() {
    SortableLinkedList[] output = new SortableLinkedList[10];
    for (int i = 0; i < 10; i ++) {
      output[i] = new SortableLinkedList();
    }
    return output;
  }
  public static void radixSortSimple(SortableLinkedList data) {
    boolean cont = true;
    int i = 0;
    while (cont) {
      cont = false;
      SortableLinkedList[] buckets = getBuckets();
      while (data.size() > 0) {
        int n = data.get(0);
        int digit = nth(n, i);
        if (!cont && digit != 0) {
          cont = true;
        }
        data.remove(0);
        buckets[nth(n, i)].add(n);
      }
      merge(data, buckets);
      i ++;
    }
  }
}
