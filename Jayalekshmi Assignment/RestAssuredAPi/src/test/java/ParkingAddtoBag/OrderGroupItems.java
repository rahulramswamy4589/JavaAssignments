package ParkingAddtoBag;

public class OrderGroupItems
{
    private int itemId;

    private String startDateTime;

    private int quantity;

    private String endDateTime;
    private String passType;

    public String getPassType() {
		return passType;
	}

	public void setPassType(String passType) {
		this.passType = passType;
	}

	public int getItemId ()
    {
        return itemId;
    }

    public void setItemId (int itemId)
    {
        this.itemId = itemId;
    }

    public String getStartDateTime ()
    {
        return startDateTime;
    }

    public void setStartDateTime (String startDateTime)
    {
        this.startDateTime = startDateTime;
    }

    public int getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (int quantity)
    {
        this.quantity = quantity;
    }

    public String getEndDateTime ()
    {
        return endDateTime;
    }

    public void setEndDateTime (String endDateTime)
    {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [itemId = "+itemId+", startDateTime = "+startDateTime+", quantity = "+quantity+", endDateTime = "+endDateTime+"]";
    }
}