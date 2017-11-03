package com.janenik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by jane on 9/7/16.
 */
public class SolutionL_15_L12_01 {


/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String text = reader.readLine();
            if ("exit".equals(text))
                break;

            try {
                if (text.contains("."))
                    print(Double.parseDouble(text));
                else if (Integer.parseInt(text) >= 128)
                    print(Integer.parseInt(text));
                else if (Integer.parseInt(text) > 0 && Integer.parseInt(text) < 128)
                    print((short) Integer.parseInt(text));
            } catch (NumberFormatException nfe) {
                print(text);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
