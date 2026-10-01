import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static boolean isEven(int n) {
        if (n%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static String checkAccess(int age) {
        if (age>18){
            return "Allowed";
        }
        else {
            return "Denied";
        }
    }

    public static boolean isPositive(int n) {
        boolean answer = (n>=0)?true:false;
        return answer;
    }

    public static String getGrade(int score) {
        if (score >= 0 && score <= 20){
            return "E";
        }
        else if (score >= 21 && score <= 40) {
            return "D";
        }
        else if (score >= 41 && score <= 60) {
            return "C";
        }
        else if (score >= 61 && score <= 80) {
            return "B";
        }
        else if (score >= 81 && score <= 100) {
            return "A";
        }
        else {
            return "Error";
        }
    }

    public static String blastOff(int start) {
        String res = "";
        for (int i = start; i > 0; i--) {
            res = res + i + " ";
        }
        return res + "Поехали!";
    }

    static int sumToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean hasBug (String[] messages) {
        for (String word: messages) {
            if (word.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }

    public static String getEvenInRange (int start, int end) {
        String res = "";
        if (start%2==0) {
            res = res + start;
        }
        for (int i = start+1; i <= end; i++) {
            if (i%2==0) {
                res = res + " " + i;
            }
        }
        return res;
    }

    public static int findMax (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String[] reverse(String[] arr) {
        String k;
        for (int i = 0; i < arr.length / 2; i++) {
            k = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = k;
        }
        return arr;
    }

    public static double calcAverage(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum / list.size();
    }

    public static List removeSpecificName(List<String> list, String nameToRemove) {
        List<String> result = new ArrayList<>();
        for (String name : list) {
            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }
        return result;
    }

}
