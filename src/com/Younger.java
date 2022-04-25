package com;

import java.time.LocalDate;

public class Younger {
    private Young[] workers;
    private int currentNumWorker;
    private Young youngWorker;

    public Younger(final int youngNum) {
        this.workers = new Young[youngNum];
        currentNumWorker = -1;
    }

    public void addWorker(Young newWorker) {
        if (++currentNumWorker < workers.length) {
            workers[currentNumWorker] = newWorker;
        }
    }

    public Young youngWorker() {
        int pos = 0;
        LocalDate minDate = workers[0].getDateOfBirth();

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getDateOfBirth().isAfter(minDate)) {
                minDate = workers[i].getDateOfBirth();
                pos = i;
            }
        }
        youngWorker = workers[pos];

        return youngWorker;
    }
}
