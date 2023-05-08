package carwashAddtoBag;

	import org.testng.annotations.Test; 
	import io.restassured.RestAssured; 
	import io.restassured.http.ContentType; 
	import io.restassured.response.Response;  
	import static io.restassured.RestAssured.*; 
	import static io.restassured.matcher.RestAssuredMatchers.*; 
	import static org.hamcrest.Matchers.*; 


public class Cartitemadded {
		@Test
		public static void CartItems()
		{
			 
			   given().queryParam("orderId","757839")
			          .when().get("https://qa.way.com/way-orders/v1/public/cart?orderId=757839").then().log()
			           .body();
			}
	}

