package com.amberlion.creational.abstractFactory.multiplatformApplication.factories;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.LinuxButton;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.LinuxCheckBox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckBox();
    }
}
