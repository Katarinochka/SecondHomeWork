import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;
import java.util.stream.IntStream;

public class Task2_1 {
    static Random random = new Random();
    @Test
    void testIsEven() {
        int n = random.nextInt(1,100);
        boolean result = Methods.isEven(n);
        System.out.println("Результат выполения метода isEven при входящем параметре " + n + ": " + result);
    }
    @RepeatedTest(20)
    void testCheckAccess() {
        int age = random.nextInt(0,99);
        String result = Methods.checkAccess(age);
        System.out.println("Результат выполения метода checkAccess при входящем параметре " + age + ": " + result);
    }
    static IntStream randomScores() {
        return random.ints(5, 0, 101);
    }
    @ParameterizedTest
    @MethodSource("randomScores")
    void testGetGrade(int score) {
        String result = Methods.getGrade(score);
        System.out.println("Результат выполения метода getGrade при входящем параметре " + score + ": " + result);
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
