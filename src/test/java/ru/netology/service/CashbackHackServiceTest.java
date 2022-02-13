package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateIfAmountTrue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 5300;
        int actual = cashbackHackService.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountFalse() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}
