package com.amberlion.creational.abstractFactory.multiplatformApplication.factories;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.MacOSButton;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
