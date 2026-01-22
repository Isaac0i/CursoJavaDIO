package ExceptionsPratice;

import javax.swing.*;

public class MoreCustomiseExPratice {
    public static void main(String[] args) {
        int[] numerator = {4, 5, 8, 10};
        int[] denominator = {2, 4, 0, 2, 8};

        for(int i = 0;i <denominator.length;i++){

            try {
                if (numerator[i] % 2 != 0)
                    throw new WrongDivisionException("Division not allowed!", numerator[i], denominator[i]);

                int result = numerator[i] / denominator[i];
                System.out.println(result);
            } catch (WrongDivisionException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("The program keep going...");
    }

}
