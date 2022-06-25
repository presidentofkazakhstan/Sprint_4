package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NameParametrizedTest {

    String name;
    boolean expected;

    public NameParametrizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { "", false},
                { "12",  false},
                { "ТимотейШевролеТимотейШевролеТимотейШевроле",  false},
                { "    ",  false},
                { " Тимотей Шевроле",  false},
                { "Тимотей Шевроле ",  false},
                { "ТимотейШевроле",  false},
                { "Тимотей Шевроле",  true},
        };
    }

    @Test
    public void shouldBeCorrect() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
