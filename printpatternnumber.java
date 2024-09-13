public class printpatternnumber {
  public static void main(String[] args) {
    // int n = 5;
    //
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    //
    //
    //

    // output
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    // invarce half piramid
    // int n = 5;
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // output
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    //
    //
    // int n = 5;
    // int number = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(number + " ");
    // number++;
    // }
    // System.out.println();
    // }
    // output
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(1);
        } else {
          System.out.print(0);
        }
      }
      System.out.println();
    }
    // output:-
    // 1
    // 01
    // 101
    // 0101
    // 10101
  }
}