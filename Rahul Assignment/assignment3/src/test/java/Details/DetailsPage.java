package Details;

public class DetailsPage
{
    private String searchType;

    private String lon;

    private PaginationDto paginationDto;

    private String listingId;

    private String lat;

    private String pricingType;

    public String getSearchType ()
    {
        return searchType;
    }

    public void setSearchType (String searchType)
    {
        this.searchType = searchType;
    }

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public PaginationDto getPaginationDto ()
    {
        return paginationDto;
    }

    public void setPaginationDto (PaginationDto paginationDto)
    {
        this.paginationDto = paginationDto;
    }

    public String getListingId ()
    {
        return listingId;
    }

    public void setListingId (String listingId)
    {
        this.listingId = listingId;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    public String getPricingType ()
    {
        return pricingType;
    }

    public void setPricingType (String pricingType)
    {
        this.pricingType = pricingType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [searchType = "+searchType+", lon = "+lon+", paginationDto = "+paginationDto+", listingId = "+listingId+", lat = "+lat+", pricingType = "+pricingType+"]";
    }
}