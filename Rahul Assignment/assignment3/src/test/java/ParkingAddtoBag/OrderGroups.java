package ParkingAddtoBag;

public class OrderGroups
{
    private Listing listing;

    private OrderGroupItems[] orderGroupItems;

    public Listing getListing ()
    {
        return listing;
    }

    public void setListing (Listing listing)
    {
        this.listing = listing;
    }

    public OrderGroupItems[] getOrderGroupItems ()
    {
        return orderGroupItems;
    }

    public void setOrderGroupItems (OrderGroupItems[] orderGroupItems)
    {
        this.orderGroupItems = orderGroupItems;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [listing = "+listing+", orderGroupItems = "+orderGroupItems+"]";
    }
}