import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static  com.codeborne.selenide.Selectors.*;
import static  com.codeborne.selenide.CollectionCondition.*;
import static  com.codeborne.selenide.Condition.*;


public class GoogleTest {
    @Test
    void shouldSearch(){
        open("https://google.com.ua");
        element(byName("q")).setValue("selenide").pressEnter();
        elements("#search .g").shouldHave(sizeGreaterThanOrEqual(6))
                .first().shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java")).click();
    }
}
