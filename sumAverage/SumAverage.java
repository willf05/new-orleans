package sumAverage;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int sum = 0;
    for (int i = lowerBound; i < upperBound + 1; i++) {
      sum += lowerBound++;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int sum = 0;
    for (int n : numbers) {
      sum += n;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    int n = lowerBound;
    double sum = 0;
    int i = 1;
    double avg = sum/i;
    while (n <= upperBound) {
      sum += n++;
      avg = sum/(i++);
    }
    return avg;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    double sum = 0;
    int i = 1;
    double avg = sum/i;
    for (int n: numbers) {
      do {
        sum += n++;
        avg = sum/(i++);
      } while (i < numbers.length);
    }
    return avg;
  }
}