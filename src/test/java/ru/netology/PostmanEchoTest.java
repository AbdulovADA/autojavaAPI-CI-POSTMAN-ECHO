package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void PostmanEchoTest() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                //.body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .body("data manager")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                //.body(/* --> ваша проверка здесь <-- */)
                .body("data", equalTo("data manager"))
        ;
    }
}