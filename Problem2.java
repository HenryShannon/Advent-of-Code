public class Problem2 {
  public static void main(String[] args) {

  }

  public static int whenBasement(string str) {
    int step = 0;
    int floor = 0;
    while (floor > 0) {
      if (str.charAt(step) == '(') {
        floor++;
      } else if (str.charAt(step) == ')') {
        floor--;
      }
      step++;
    }
    return step;
  }
}
