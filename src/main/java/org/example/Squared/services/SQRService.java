package org.example.Squared.services;

public class SQRService {

    public int fetchSquares(int lower, int upper) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {

            if (i * i < lower) {
                continue;
            }
            if (i * i > upper) {
                break;
            }
            count++;
        }
        return count;
    }
}