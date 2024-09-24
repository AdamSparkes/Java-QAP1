public class Date {
    //fields
    private int Day;
    private int Month;
    private int Year;
    
    public Date(int Day, int Month, int Year){
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }
    //the Get Methods
    public int getDay(){
        return this.Day;
    }
     public int getMonth(){
        return this.Month;
    }
     public int getYear(){
        return this.Year;
    }
    //the void Set methods
    public void setDay(int Day){
        this.Day = Day;
    }
    public void setMonth(int Month){
        this.Month = Month;
    }
    public void setYear(int Year){
        this.Year = Year;
    }

    //to string method
    public String toString() {
        return String.format("%02d/%02d/%04d", this.Day, this.Month, this.Year);
    }
}
