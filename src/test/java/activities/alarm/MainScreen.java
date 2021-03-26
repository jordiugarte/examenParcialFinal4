package activities.alarm;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addButton = new Button(By.id("com.android.deskclock:id/float_add"));
    public Button acceptButton = new Button(By.id("android:id/icon2"));
    public Button nameTextBoxButton = new Button(By.id("com.android.deskclock:id/textarrow_label_layout"));
    public Button acceptNameButton = new Button(By.id("android:id/button1"));
    public TextBox nameTextBox = new TextBox(By.id("com.android.deskclock:id/username_edit"));

    public Label getAlarm(String name) {
        return new Label(By.xpath("//android.widget.TextView[@text='" + name + "']"));
    }

}
