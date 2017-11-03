package com.janenik;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class SolutionL_13_L_11_H04 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));
        String fileName = reader.readLine();
        while(fileName.isEmpty()) {
            fileName = reader.readLine();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

        while (true) {
            String line = reader.readLine(); // Read line. Note: no end line character!
            bufferedWriter.write(line); // Write line.
            bufferedWriter.write('\n'); // Write new line character.

            if ("exit".equals(line)) {
                break;
            }
        }

        bufferedWriter.close(); // As this is behind the buffered reader - need to force its content written.
        fileOutputStream.close(); // Close file.
    }
}
