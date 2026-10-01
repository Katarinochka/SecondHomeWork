import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task2_2 {
    static Random random = new Random();
    static IntStream randomNumbers() {
        return random.ints(3, 0, 101);
    }
    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testIsEven(int n) {
        boolean res = Methods.isEven(n);
        boolean  exp = (n % 2 == 0) ? true : false;
        System.out.println("Ожидаемый результат теста метода isEven со значением " + n + ": " + exp);
        System.out.println("Фактический результат теста метода isEven со значением " + n + ": " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testGetGrade(int score) {
        String res = Methods.getGrade(score);
        String exp;
        if (score >= 0 && score <= 20){
            exp = "E";
        }
        else if (score >= 21 && score <= 40) {
            exp = "D";
        }
        else if (score >= 41 && score <= 60) {
            exp = "C";
        }
        else if (score >= 61 && score <= 80) {
            exp = "B";
        }
        else if (score >= 81 && score <= 100) {
            exp = "A";
        }
        else {
            exp = "Error";
        }
        System.out.println("Ожидаемый результат теста метода checkAccess со значением " + score + ": " + exp);
        System.out.println("Фактический результат теста метода checkAccess со значением " + score + ": " + res);
        if (res.equals(exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testBlastOff(int start) {
        String res = Methods.blastOff(start);
        String exp = "";
        for (int i = start; i > 0; i--) {
            exp = exp + i + " ";
        }
        exp = exp + "Поехали!";
        System.out.println("Ожидаемый результат теста метода blastOff со стартовым значением " + start + ": " + exp);
        System.out.println("Фактический результат теста метода blastOff со стартовым значением " + start + ": " + res);
        if (res.equals(exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testSumToN(int n) {
        int res = Methods.sumToN(n);
        int exp = 0;
        for (int i = 0; i <= n; i++) {
            exp = exp + i;
        }
        System.out.println("Ожидаемый результат теста метода sumToN со значением " + n + ": " + exp);
        System.out.println("Фактический результат теста метода sumToN со значением " + n + ": " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(2)
    void testCheckAccess() {
        int age = random.nextInt(0,100);
        String res = Methods.checkAccess(age);
        String exp = (age > 18) ? "Allowed" : "Denied";
        System.out.println("Ожидаемый результат теста метода checkAccess со значением " + age + ": " + exp);
        System.out.println("Фактический результат теста метода checkAccess со значением " + age + ": " + res);
        if (res.equals(exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @RepeatedTest(2)
    void testIsPositive() {
        int n = random.nextInt(-100,101);
        boolean res = Methods.isPositive(n);
        boolean  exp = (n >= 0) ? true : false;
        System.out.println("Ожидаемый результат теста метода isPositive со значением " + n + ": " + exp);
        System.out.println("Фактический результат теста метода isPositive со значением " + n + ": " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @RepeatedTest(2)
    void testHasBug() {
        String[] str1 = {"bug","sunset","street"};
        boolean res = Methods.hasBug(str1);
        boolean exp = false;
        for (String word: str1) {
            if (word.equalsIgnoreCase("Bug")) {
                exp = true;
                break;
            }
        }
        System.out.println("Ожидаемый результат теста метода hasBug со значением " + Arrays.toString(str1) + ": " + exp);
        System.out.println("Фактический результат теста метода hasBug со значением " + Arrays.toString(str1) + ": " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @RepeatedTest(2)
    void testGetEvenInRange() {
        int start = random.nextInt(0,101);
        int end = random.nextInt(0,101);
        String res = Methods.getEvenInRange(start,end);
        String exp = "";
        if (start%2==0) {
            exp = exp + start;
        }
        for (int i = start+1; i <= end; i++) {
            if (i%2==0) {
                exp = exp + " " + i;
            }
        }
        System.out.println("Ожидаемый результат теста метода getEvenInRange со значением start = " + start + "и end =" + end + ": " + exp);
        System.out.println("Фактический результат теста метода getEvenInRange со значением start = " + start + "и end =" + end + ": " + res);
        if (res.equals(exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }

    @Test
    void testFindMax() {
        int[] array = {0,0,0,0,0};
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,101);
        }
        int res = Methods.findMax(array);
        int exp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>exp) {
                exp = array[i];
            }
        }
        System.out.println("Ожидаемый результат теста метода findMax: " + exp);
        System.out.println("Фактический результат теста метода findMax: " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @Test
    void testReverse() {
        String[] str2 = {"bug","sunset","street"};
        String[] res = Methods.reverse(str2);
        String[] exp = {"street","sunset","bug"};
        System.out.println("Ожидаемый результат теста метода reverse: " + Arrays.toString(exp));
        System.out.println("Фактический результат теста метода reverse: " + Arrays.toString(res));
        if (Arrays.deepEquals(res, exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @Test
    void testCalcAverage() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1);
        double res = Methods.calcAverage(numbers);
        double exp = 0;
        for (int i = 0; i < numbers.size(); i++) {
            exp = exp + numbers.get(i);
        }
        exp = exp / numbers.size();
        System.out.println("Ожидаемый результат теста метода calcAverage: " + exp);
        System.out.println("Фактический результат теста метода calcAverage: " + res);
        if (res == exp) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @Test
    void testRemoveSpecificName() {
        List<String> names1 = List.of("Анна", "Борис", "Екатерина", "Надежда", "Виктор");
        List<String> res = Methods.removeSpecificName(names1, "Борис");
        List<String> exp = new ArrayList<>();
        for (String name : names1) {
            if (!name.equals("Борис")) {
                exp.add(name);
            }
        }
        System.out.println("Ожидаемый результат теста метода removeSpecificName: " + exp);
        System.out.println("Фактический результат теста метода removeSpecificName: " + res);
        if (res.equals(exp)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
    @BeforeEach
    void printBefore() {
        System.out.println("========================");
        System.out.println("Test method start");
    }
    @AfterEach
    void printAfter() {
        System.out.println("Test method end");
        System.out.println("========================");
    }
}
