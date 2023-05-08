package Details;

public class PaginationDto
{
    private int pageNumber;

    private int pageSize;

    public int getPageNumber ()
    {
        return pageNumber;
    }

    public void setPageNumber (int i)
    {
        this.pageNumber = i;
    }

    public int getPageSize ()
    {
        return pageSize;
    }

    public void setPageSize (int pageSize)
    {
        this.pageSize = pageSize;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pageNumber = "+pageNumber+", pageSize = "+pageSize+"]";
    }
}