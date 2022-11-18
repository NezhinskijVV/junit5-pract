package numbers;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Isolated;

import static io.restassured.RestAssured.given;

@Disabled("Disabled until bug #99 has been fixed")
@Isolated
public class NumbersTest {
    public static final String NUMBERS_URI = "http://numbersapi.com";
    public static final String ID_PATH = "/{id}";


    @Test
    public void shouldHaveCorrectGet2() {
        given()
                .baseUri(NUMBERS_URI)
                .pathParam("id", 2)
                .when()
                .get(ID_PATH)
                .then()
                .log().all()
                .statusCode(200);
    }
}