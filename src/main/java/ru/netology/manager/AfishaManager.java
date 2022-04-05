package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] items = new Afisha[0];
    private final int defaultLength;

    public AfishaManager() {
        this.defaultLength = 10;
    }

    public AfishaManager(int defaultLength) {
        this.defaultLength = defaultLength;

    }

    public void add(Afisha newItem) {
        Afisha[] tmp = new Afisha[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = newItem;
        this.items = tmp;

    }

    public Afisha[] findAll() {
        return items;
    }

    public Afisha[] findLast() {
        int resultLength = Math.min(defaultLength, items.length);
        Afisha[] tmp = new Afisha[resultLength];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];

        }
        return tmp;

    }
}