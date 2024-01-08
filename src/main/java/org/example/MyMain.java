package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyMain {

    public static void main(String[] args) throws IOException {

        InputStreamReader   is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        String name = reader.readLine();

        Person p1 = new Employee(101,"Wipro",name,"India",31);
        p1.show();
    }
}