import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.*;
import static  com.codeborne.selenide.Selectors.*;
import static  com.codeborne.selenide.CollectionCondition.*;
import static  com.codeborne.selenide.Condition.*;

public class AppleinsiderTest extends BaseTest{
    @Test
    void searchButton(){
        open("https://appleinsider.ru");
        element(byName("sa")).click();
        element(byName("s")).setValue("iPhone 13").pressEnter();


    }

}
