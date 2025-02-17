package com.java.wipro.designpattern.factory.factories;

import com.java.wipro.designpattern.factory.button.Button;
import com.java.wipro.designpattern.factory.button.MacOSButton;
import com.java.wipro.designpattern.factory.checkboxes.Checkbox;
import com.java.wipro.designpattern.factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    public Button createButton() {
        return new MacOSButton();
    }

    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}