package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EchoChamber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String a=null;
        while (true) {
            a = reader.readLine();

            if(a.equals("")) {
                break;
            }
            list.add(a);
        }
        for (String name : list) {
            System.out.println(name);
        }
        reader.close();
    }
}
