import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта "Appleincider"
 */

public class MainPage {

    private final SelenideElement TEXT_BOX_INPUT = $x("//input[@type='text']");
    private final SelenideElement SEARCH_BUTTON = $x("//form");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Цепочка возвращения старницы
     */
    public SearchPages search(String searchString) {
        TEXT_BOX_INPUT.setValue(searchString);
        TEXT_BOX_INPUT.sendKeys(Keys.ENTER);
        return new SearchPages();
    }
}
