import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru/"; // дублировать строку command d
    private final static String SEARCH_STRING = "Чем iPhone 14 Plus отличается от iPhone 14 Pro Max";

    @Test
    public void checkHrefArticle() {
        MainPage mainPage = new MainPage(BASE_URL);
        String href = mainPage.search(SEARCH_STRING).getHrefFirstArticle();
        Assert.assertTrue(href.contains("iphone-14-plus"));
    }
}
