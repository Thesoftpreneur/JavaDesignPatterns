package com.amberlion.creational.singleton;

import lombok.Getter;

/**
 * A class created for testing singleton pattern with included DCL (Double checked-locking).
 */
@Getter
public final class Singleton {
    private  static volatile Singleton instance;
    public String value;

    /**
     * Constructor
     * The sleep emulates the slow initialization
     * @param value name candidate of the singleton
     */
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    /**
     * Invokes the constructor
     * @param value name candidate of the singleton
     * @return instance
     */
    public static Singleton getInstance(String value) {
        if (instance != null) {
            return instance;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
