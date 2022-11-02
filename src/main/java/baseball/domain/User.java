package baseball.domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class User {
    private static String ISDIGIT_EXCEPTION = "숫자가 아닙니다.";
    private static String DUPLICATION_EXCEPTION = "중복된 숫자가 존재합니다.";
    private static String VALID_NUMBER_EXCEPTION = "가능하지 않은 숫자 입니다.";
    private static int MIN_NUM = 1;
    private static int MAX_NUM = 9;
    public ArrayList<Integer> userNumbers;

    public void getUserNumbers() {
        String numbers = Console.readLine();
        this.userNumbers = parseStringToInt(numbers);
    }

    public ArrayList<Integer> parseStringToInt(String numbers) {
        ArrayList<Integer> inputNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            inputNumbers.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
        }
        return inputNumbers;
    }

    public void checkIsDigit(char number) {
        if (!Character.isDigit(number)) {
            throw new IllegalArgumentException(ISDIGIT_EXCEPTION);
        }
    }

    public void checkDuplicationNumber(ArrayList<Integer> numbers,int number){
        if(numbers.contains(number)){
            throw new IllegalArgumentException(DUPLICATION_EXCEPTION);
        }
    }

    public void checkVaildNumber(int number){
        if(number < MIN_NUM || number > MAX_NUM){
            throw new IllegalArgumentException(VALID_NUMBER_EXCEPTION);
        }
    }
}
