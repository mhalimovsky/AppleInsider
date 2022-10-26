import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPages {
    private final ElementsCollection articleTitle = $$x("//h2//a");

    /**
     * @return href from first article;
     */

    public String getHrefFirstArticle() {
        return articleTitle.first().getAttribute("href");
    }
}
