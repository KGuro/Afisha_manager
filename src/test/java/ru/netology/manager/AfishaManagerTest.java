package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    private AfishaManager service = new AfishaManager();
    private Afisha firstAfisha = new Afisha(1, "Начало", 2010);
    private Afisha secondAfisha = new Afisha(2, "Вперед", 2019);


    @Test
    void shouldAdd(){
        Afisha[] expected = {firstAfisha, secondAfisha,};

        service.add(firstAfisha);
        service.add(secondAfisha);

        assertArrayEquals (expected, service.findAll());
    }

    @Test
    void shouldFindLast(){
        Afisha[] expected = {secondAfisha, firstAfisha,};

        service.add(firstAfisha);
        service.add(secondAfisha);

        assertArrayEquals (expected, service.findLast());
    }
    @Test
    void shouldFindLastOne(){
        AfishaManager afishaManager = new AfishaManager(1);
        Afisha[] expected = {secondAfisha,};

        afishaManager.add(firstAfisha);
        afishaManager.add(secondAfisha);

        assertArrayEquals (expected, afishaManager.findLast());
    }

}