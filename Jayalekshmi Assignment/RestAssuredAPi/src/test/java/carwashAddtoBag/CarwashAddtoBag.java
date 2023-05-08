package carwashAddtoBag;

public class CarwashAddtoBag
{
    private String orderType;

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
        return "ClassPojo [orderType = "+orderType+", page = "+page+", orderGroups = "+orderGroups+"]";
    }
}