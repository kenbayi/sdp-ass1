package factories.ui;

import models.ui.Button;
import models.ui.DarkThemeButton;

public class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}
