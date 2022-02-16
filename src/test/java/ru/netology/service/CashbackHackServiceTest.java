package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


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
        int expected = 0;
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
