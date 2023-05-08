package Details;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainClassofDetails {
	
	public static void main (String[]args)
	{
	
		DetailsPage detailspage = new DetailsPage();
		PaginationDto  paginationdto = new PaginationDto();
	
	detailspage.setLat("37.78377680000001");
	detailspage.setLon("-122.4198914");
	detailspage.setSearchType("PARKING");
	detailspage.setListingId("6179105");
	detailspage.setPricingType("Hourly");
	paginationdto.setPageNumber(1);
	paginationdto.setPageSize(1);
	detailspage.setPaginationDto(paginationdto);

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
	System.out.println(gson.toJson(detailspage));
	}
	}
	
	

