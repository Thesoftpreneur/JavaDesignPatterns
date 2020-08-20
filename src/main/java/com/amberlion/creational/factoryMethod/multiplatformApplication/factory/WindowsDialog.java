package com.amberlion.creational.factoryMethod.multiplatformApplication.factory;

import com.amberlion.creational.factoryMethod.multiplatformApplication.buttons.Button;
import com.amberlion.creational.factoryMethod.multiplatformApplication.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
