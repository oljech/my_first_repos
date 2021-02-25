package com.knu.lab4;

import java.io.IOException;

public class Lab4 {
    public static void main(String[] args) throws IOException {
        for(int i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println(i);
        }
    }
}
