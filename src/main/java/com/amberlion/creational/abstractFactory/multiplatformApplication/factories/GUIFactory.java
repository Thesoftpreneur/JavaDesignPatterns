package com.amberlion.creational.abstractFactory.multiplatformApplication.factories;

import com.amberlion.creational.abstractFactory.multiplatformApplication.buttons.Button;
import com.amberlion.creational.abstractFactory.multiplatformApplication.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
