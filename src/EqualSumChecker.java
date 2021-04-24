public class EqualSumChecker {

    public static boolean hasEqualSum (int firstNumber, int secondNumber, int thirdNumber){



        if (firstNumber + secondNumber != thirdNumber){
            return false;
        }
        if (firstNumber + secondNumber == thirdNumber){
            return true;
        }else if(firstNumber + (-secondNumber) == 0){

        }
        return true;
    }

}
