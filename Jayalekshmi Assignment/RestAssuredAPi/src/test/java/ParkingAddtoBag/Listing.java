package ParkingAddtoBag;

public class Listing
{
    private String serviceType;

    private int listingId;

    public String getServiceType ()
    {
        return serviceType;
    }

    public void setServiceType (String serviceType)
    {
        this.serviceType = serviceType;
    }

    public int getListingId ()
    {
        return listingId;
    }

    public void setListingId (int listingId)
    {
        this.listingId = listingId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [serviceType = "+serviceType+", listingId = "+listingId+"]";
    }
}