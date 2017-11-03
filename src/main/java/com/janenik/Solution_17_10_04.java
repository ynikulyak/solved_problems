package com.janenik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/
public class Solution_17_10_04 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String urlString = reader.readLine();
            Url url = new Url(urlString);

            // Output all parameters.
            List<String> keys = url.getParametersNames();
            for (int index = 0; index < keys.size(); index++) {
                String parameterName = keys.get(index);
                System.out.print(parameterName);
                if (index < keys.size() - 1) {
                    System.out.print(' ');
                }
            }
            System.out.println();

            // Output 'obj' if it is present.
            if (url.hasParameter("obj")) {
                String objectValueAsString = url.getParameter("obj");
                try {
                    double objectValueAsDouble = Double.parseDouble(objectValueAsString);
                    alert(objectValueAsDouble);
                } catch (NumberFormatException nfe) {
                    alert(objectValueAsString);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

    public static class Url {

        private static final String SCHEME_SEPARATOR = "://";
        private static final char SLASH = '/';
        private static final char QUESTION = '?';
        private static final char EQUALS = '=';

        private final String url;
        private final String scheme;
        private final String host;
        private final String path;
        private final Map<String, String> parameters;

        public Url(String url) {
            this.url = url;

            // Parse scheme.
            int indexOfSchemeStart = url.indexOf(SCHEME_SEPARATOR);
            if (indexOfSchemeStart < 0) {
                throw new IllegalArgumentException("Invalid URL: " + url);
            }
            this.scheme = url.substring(0, indexOfSchemeStart);

            // Parse host.
            int indexOfSlash = url.indexOf(SLASH, indexOfSchemeStart + 3);
            int indexOfHostEnd = (indexOfSlash > 0) ? indexOfSlash : -1;
            // No slash.
            if (indexOfHostEnd < 0) {
                int temp = url.indexOf(QUESTION, indexOfSchemeStart + 3);
                if (temp < 0) {
                    indexOfHostEnd = url.length();
                } else {
                    indexOfHostEnd = temp;
                }
            }
            this.host = url.substring(indexOfSchemeStart + 3, indexOfHostEnd);

            // Parse path.
            int indexOfQuestion = url.indexOf(QUESTION, indexOfHostEnd);
            indexOfQuestion = (indexOfQuestion > 0) ? indexOfQuestion : url.length();
            this.path = url.substring(indexOfHostEnd, indexOfQuestion);

            // Parse parameters.
            this.parameters = new LinkedHashMap<>();
            if (indexOfQuestion < url.length()) {
                String parametersString = url.substring(indexOfQuestion + 1, url.length());
                String[] keyValuePairs = parametersString.split("&"); // key=value.
                for (String keyValue : keyValuePairs) {
                    int indexOfEquals = keyValue.indexOf(EQUALS);
                    String key = (indexOfEquals >= 0) ? keyValue.substring(0, indexOfEquals) : keyValue;
                    String value = (indexOfEquals >= 0) ? keyValue.substring(indexOfEquals + 1, keyValue.length()) : "";
                    this.parameters.put(key, value);
                }
            }
        }

        public String getScheme() {
            return scheme;
        }

        public String getHost() {
            return host;
        }

        public Map<String, String> getParameters() {
            return parameters;
        }

        public List<String> getParametersNames() {
            return new ArrayList<>(getParameters().keySet());
        }

        public boolean hasParameter(String name) {
            return getParameters().containsKey(name);
        }

        public String getParameter(String name) {
            return getParameters().get(name);
        }
    }
}
