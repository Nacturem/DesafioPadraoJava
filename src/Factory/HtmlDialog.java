package Factory;

import Buttons.Button;
import Buttons.HtmlButton;


public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {

        return new HtmlButton();
    }
}