package java1.lessonsforqa.lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class RandomExceptionsClass {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
//        int a = 10, b = 0;
        int a = 10, b = 1;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
//        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
//        callMethod2(100000000, 10 - 10);
        callMethod2(100000000, 10 - 9);
        return new ArrayList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");

        File file = new File("1.txt");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            fis.read();
            if (fis.available() > 0) throw new RuntimeException();
        } else {
            System.out.println("File no found");
        }

        int num = callMethod4("1240");
        if (b != 0) {
            return a/b;
        }
        else {
            throw new RuntimeException("������ �� 0 ������.");
        }
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        boolean flag = true;
        for (char x: s.toCharArray()) {
            if(!Character.isDigit(x)) flag = false;
        }
        if (flag)  return Integer.parseInt(s);
        else {
            throw new RuntimeException("������ �� �������� �����");
        }
    }

    private static void callMethod5(String s) {
        callMethod6("");
            String[] strings = new String[5];
            for (int i = 1; i < strings.length; i++) {
                strings[i] = s;
            }
    }
}
