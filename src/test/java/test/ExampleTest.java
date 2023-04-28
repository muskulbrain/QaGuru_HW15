package test;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.io.*;
import java.time.Duration;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ExampleTest {

    @Test
    public void checkVisibilityCookiesPopup() {
        open("https://www.digitalleague.ru/");


        $(".cookie-modal__text").is(visible);
        //Assertions.assertTrue($(".cookie-modal__text").getText().contains("Сайт использует файлы cookie."),
                //"Ошибка, текст не содержит cookie");
        //Assertions.assertTrue($(".cookie-modal__btn").getText().contains("Согласен"),
                //"Ошибка, текст не содержит Согласен");
        $(".cookie-modal").$(byText("Согласен")).click();
        //$(".cookie-modal__btn").is(not(visible));
    }


}
