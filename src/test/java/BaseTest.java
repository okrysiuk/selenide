import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    public static void Setup(){
        Configuration.headless = false;
        Configuration.browserSize = "1280x1024";
    }
    @BeforeAll
    public static void init(){
        Setup();
    }
}
