package com.java.wipro.designpattern.factory.factories;

import com.java.wipro.designpattern.factory.button.Button;
import com.java.wipro.designpattern.factory.button.WindowsButton;
import com.java.wipro.designpattern.factory.checkboxes.Checkbox;
import com.java.wipro.designpattern.factory.checkboxes.WindowsCheckbox;

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