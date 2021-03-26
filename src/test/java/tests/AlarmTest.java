package tests;

import activities.alarm.MainScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import session.Session;

import java.net.MalformedURLException;

public class AlarmTest {

    MainScreen mainScreen = new MainScreen();

    @Test
    public void operationAdditionTest() throws MalformedURLException {
        String name = "Alarma de prueba";
        mainScreen.addButton.click();
        mainScreen.nameTextBoxButton.click();
        mainScreen.nameTextBox.set(name);
        mainScreen.acceptNameButton.click();
        mainScreen.acceptButton.click();
        Assert.assertTrue("ERROR", mainScreen.getAlarm(name + ", Sonar solo una vez").isControlDisplayed());
    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
