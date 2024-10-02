package factories.ui;

import models.ui.Button;

public abstract interface UIFactory {
    Button createButton();
}
