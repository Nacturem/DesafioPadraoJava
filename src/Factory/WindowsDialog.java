package Factory;

import Buttons.Button;
import Buttons.WindowsButton;


public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {

        return new WindowsButton();
    }
}