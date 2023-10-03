public class task2 {
  public static void main(String[] args) {
    int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < x.length; i++) {
      for(int j = 0; j < x[i].length; j++) {
        if(x[i][j] < min) {
          min = x[i][j];
        }
      }
    }

    System.out.println("Минимальный элемент массива: " + min);
  }
}
