package com.amberlion.creational.abstractFactory.multiplatformApplication;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.GUIFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.LinuxFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.MacOSFactory;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.WindowsFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Button getButton() {
        return button;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static Application configureApplication(String osName) {
        Application app;
        GUIFactory factory;
        //String osName = System.getProperty("os.name").toLowerCase();
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
}
