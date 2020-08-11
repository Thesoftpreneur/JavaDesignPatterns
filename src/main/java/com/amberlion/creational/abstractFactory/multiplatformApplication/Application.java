package com.amberlion.creational.abstractFactory.multiplatformApplication;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;
import com.amberlion.creational.abstractFactory.multiplatformApplication.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
