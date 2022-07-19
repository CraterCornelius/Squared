package org.example.Squared.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/fetchSquaresData.scv")

    public void randomFrameNarrow(int expected, int lower, int upper) {
        SQRService service = new SQRService();

        //int expected = 14;
        int actual = service.fetchSquares(lower, upper);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void frameLowerBottom() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.fetchSquares(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //
    //public void randomFrameWide() {
    //   SQRService service = new SQRService();
    //
    //  int expected = 35;
    //   int actual = service.fetchSquares(100, 2000);

    //  Assertions.assertEquals(expected, actual);
   // }
}
