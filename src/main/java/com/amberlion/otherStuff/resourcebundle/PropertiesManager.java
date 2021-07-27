package com.amberlion.otherStuff.resourcebundle;

import java.util.ResourceBundle;

public class PropertiesManager {
    private PropertiesManager() {}

    public static String getProperty(String key) {
        return ResourceBundle.getBundle("default").getString(key);
    }
}
