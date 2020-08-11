package com.amberlion.creational.abstractFactory.multiplatformApplication;

import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.GUIFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.MacOSFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.LinuxFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else if (osName.contains("windows")){
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
