package io.quarkiverse.jnosql.document.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import org.junit.jupiter.api.Test;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@QuarkusTestResource(ArangodbTestResource.class)
public class JNoSQLResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/jnosql")
                .then()
                .statusCode(200)
                .body(is(not(empty())));
    }
}
