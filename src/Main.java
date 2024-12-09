
public class Main {
    public static void main(String[] args) {
        boolean foundNegative = false;
        int count = 0;
        double sum = 0;


        double [] array = {3.5, 6.4, 5.6, 7.7, 8.8, -6.6, -3.7,
                -5,8, -7.7, -6.6, -5.6, 7.6, 8.1, 3.9, 6.8 };

        for (double number : array){
            if (foundNegative && number > 0 ){
                sum += number;
                count++;

            } else {
                foundNegative = true;
            }
        }

        if (count >0){
            double average = sum / count;
            System.out.println("Среднее арифметичемкое: " + average);
        }
    }
}