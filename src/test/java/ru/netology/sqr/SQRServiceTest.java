package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldAmountSqr() {
        SQRService service = new SQRService();
        int actual = service.amountSqr(200, 300);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountSqrMinEqualMax() {
        SQRService service = new SQRService();
        int actual = service.amountSqr(200, 200);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountSqrMinZero() {
        SQRService service = new SQRService();
        int actual = service.amountSqr(0, 300);
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountSqrMinMoreMax() {
        SQRService service = new SQRService();
        int actual = service.amountSqr(300, 0);
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
