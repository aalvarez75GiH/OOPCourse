package JavaFiles;

class uberCard extends payment
{
    Integer number;
    Integer cvv;
    String date;
    
    public uberCard(Integer id,Integer number, Integer cvv, String date)
    {
        super(id);
        this.number = number ;
        this.cvv = cvv;
        this.date = date;
    }
}