

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < (arr.length / 2); i += 1) {
      int change = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = change;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    int lowCounter = 0;

    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num <= lowest) { 
        if(num == lowest){
          lowCounter++;
        }else{
          lowest = num;
          lowCounter = 0;
          lowCounter++;
        } 
      }

    }

    double sum = 0;

    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - lowCounter);
  }
}

