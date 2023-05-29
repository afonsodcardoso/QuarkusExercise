package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LabSeqResourceTest {

    //define a test to be run so that the command " ./mvnw clean install"
    @Test
    public void testLabSeqEndpoint() {
        given()
                .pathParam("n", 10)
                .when().get("/labseq/{n}")
                .then()
                .statusCode(200)
                .body(is("3"));
    }
}
