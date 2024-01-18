public class test {
    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }
        printMax(34, 3, 3, 2, 56.5);
    }


    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
           System.out.println("No argument passed");
           return;
        }
  
        double result = numbers[0];
  
        for (double num: numbers){
              if (num > result)
              result = num;
        }
        System.out.println("The max value is " + result);
     }
}
