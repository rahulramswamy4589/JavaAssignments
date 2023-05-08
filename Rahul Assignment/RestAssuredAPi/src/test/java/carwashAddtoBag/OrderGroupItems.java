package carwashAddtoBag;
public class OrderGroupItems 

{
    private int itemId;

    private String passType;

    private int quantity;

    public int getItemId ()
    {
        return itemId;
    }

    public void setItemId (int itemId)
    {
        this.itemId = itemId;
    }

    public String getPassType ()
    {
        return passType;
    }

    public void setPassType (String passType)
    {
        this.passType = passType;
    }

    public int getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [itemId = "+itemId+", passType = "+passType+", quantity = "+quantity+"]";
    }
}