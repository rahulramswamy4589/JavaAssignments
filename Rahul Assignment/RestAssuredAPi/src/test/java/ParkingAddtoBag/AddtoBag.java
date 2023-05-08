package ParkingAddtoBag;

public class AddtoBag
{
    private String orderType;

    private String orderId;

    private String page;

    private OrderGroups[] orderGroups;

    public String getOrderType ()
    {
        return orderType;
    }

    public void setOrderType (String orderType)
    {
        this.orderType = orderType;
    }

    public String getOrderId ()
    {
        return orderId;
    }

    public void setOrderId (String orderId)
    {
        this.orderId = orderId;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public OrderGroups[] getOrderGroups ()
    {
        return orderGroups;
    }

    public void setOrderGroups (OrderGroups[] orderGroups)
    {
        this.orderGroups = orderGroups;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [orderType = "+orderType+", orderId = "+orderId+", page = "+page+", orderGroups = "+orderGroups+"]";
    }
}