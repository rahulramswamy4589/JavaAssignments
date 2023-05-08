package ParkingAddtoBag;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MainClassofAddtoBag 
{
	public static void main (String[]args)
	{
	AddtoBag addtobag = new AddtoBag();
	Listing listing  = new Listing();
	OrderGroupItems[] ordergroupitems = new OrderGroupItems[1];
	OrderGroups ordergroups[] = new OrderGroups[1];
	addtobag.setPage("way-angular");
	addtobag.setOrderType("CART");
	addtobag.setOrderId("757839");
	listing.setListingId(6179105);
	listing.setServiceType("PARKING");
	
	ordergroupitems [0] = new OrderGroupItems();
	ordergroupitems[0].setStartDateTime("2023-08-12 05:30:00");
	ordergroupitems[0].setEndDateTime("2023-08-18 06:00:00");
	ordergroupitems[0].setItemId(6179106);
	ordergroupitems[0].setQuantity(1);
	 ordergroups[0] = new OrderGroups();
	ordergroups[0].setListing(listing);
	ordergroups[0].setOrderGroupItems(ordergroupitems);
	addtobag.setOrderGroups(ordergroups);
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	System.out.println(gson.toJson(addtobag));
	
	System.out.println(gson.toJson(addtobag));

	RestAssured.baseURI = "https://qa.way.com/way-orders/";
	String requestString = gson.toJson(addtobag);
	// GIVEN
	Response res = given().header("Content-type", "application/json").header("User-Agent", "PostmanRuntime/7.6.0").and().urlEncodingEnabled(false)
			// .urlEncodingEnabled(true)
			.log().all().urlEncodingEnabled(true).and().body(requestString)

			// WHEN
			.when().post("v1/public/cart")

			// THEN
			.then()

			.extract().response();
	System.out.println("out" + res.statusLine());
	System.out.println (res.getBody().asString());
}
}

	


