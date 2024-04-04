package basic;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicProgram {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RestAssured.basePath="/api/users";
		given().log().all().queryParam("page", 2)
			.when().get()
				.then().log().all()
					.assertThat()
						.statusCode(200);

	}

}
