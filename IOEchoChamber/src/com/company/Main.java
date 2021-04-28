package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {
        try {

            List<String> lines = Files.readAllLines(Paths.get(args[0]), UTF_8);

            int count = 1;
            for (String s : lines) {
                if (count % 2 == 1) {
                    System.out.println(s);
                }
                count++;
            }
        }
        catch (NoSuchFileException |ArrayIndexOutOfBoundsException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> list = new ArrayList<>();
            String a = null;
            while (true) {
                a = reader.readLine();

                if (a.equals("")) {
                    break;
                }
                list.add(a);
            }
            int countS = 1;
            for (String name : list) {
                if (countS % 2 == 1) {
                    System.out.println(name);
                }
                countS++;
            }
            reader.close();
        }
      }
  }
