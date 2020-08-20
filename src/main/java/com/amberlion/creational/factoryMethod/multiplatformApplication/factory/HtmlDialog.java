package com.amberlion.creational.factoryMethod.multiplatformApplication.factory;

import com.amberlion.creational.factoryMethod.multiplatformApplication.buttons.Button;
import com.amberlion.creational.factoryMethod.multiplatformApplication.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
