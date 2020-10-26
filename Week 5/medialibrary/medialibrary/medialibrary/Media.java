package medialibrary;

/* 
    Author: Peter Pasieka
    Start date: 28/09/2020
    Version: v0.1
    Program Details: dunno
    Class Purpose:

*/
public class Media // class start
{
    public String mName;
    public String mDescription;

    public Media(String name, String description)
    {
        mName = name;
        mDescription = description;

    }

    // Setters
    public void setName(String newName)
    {
        this.mName = newName;

    }

    public void setDesc(String newDesc)
    {
        this.mDescription = newDesc;
    }
    
    // Getters
    public String getName()
    {
        return(mName);
    }

    public String getDesc()
    {
        return(mDescription);
    }
    
} // class end
