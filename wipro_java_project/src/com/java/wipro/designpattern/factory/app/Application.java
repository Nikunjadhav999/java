package com.java.wipro.designpattern.factory.app;

import com.java.wipro.designpattern.factory.button.Button;
import com.java.wipro.designpattern.factory.checkboxes.Checkbox;
import com.java.wipro.designpattern.factory.factories.GUIFactory;

public class Application 
{
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