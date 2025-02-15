package com.java.wipro.designpattern.factory.factories;

import com.java.wipro.designpattern.factory.button.Button;
import com.java.wipro.designpattern.factory.checkboxes.Checkbox;

public interface GUIFactory 
{
	  Button createButton();
	    Checkbox createCheckbox();

}
