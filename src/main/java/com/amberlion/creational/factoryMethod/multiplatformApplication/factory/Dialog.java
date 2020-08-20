package com.amberlion.creational.factoryMethod.multiplatformApplication.factory;

import com.amberlion.creational.factoryMethod.multiplatformApplication.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {


        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();
}
