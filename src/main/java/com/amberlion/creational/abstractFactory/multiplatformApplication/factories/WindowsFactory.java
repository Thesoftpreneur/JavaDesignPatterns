package com.amberlion.creational.abstractFactory.multiplatformApplication.factories;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.WindowsButton;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
