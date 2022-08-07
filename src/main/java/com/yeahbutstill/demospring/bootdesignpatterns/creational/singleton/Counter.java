package com.yeahbutstill.demospring.bootdesignpatterns.creational.singleton;

public class Counter {

    private Long value = 0L;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    // fix the raceconditions, java threads synchronization ketika ada beberapa thread mengakses method ini
    // maka thread hanya boleh 1 yang mengakses, yang lain suruh nunggu. jatohnya akan lebih lambat tapi lebih aman
    public synchronized void increment() {
        value++;
    }

}
