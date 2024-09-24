public class Time{
    private int hour;
    private int minute;
    private int sec;  // seconds referred to as "sec" for naming ease purposes. 

//constructor
public Time(int hour, int minute, int sec) {
    this.hour = hour;
    this.minute = minute;
    this.sec = sec;
}
//get methods
public int getHour(){
    return this.hour;
}
public int getMinute(){
    return this.minute;
}
public int getSecond(){
    return this.sec;
}
//set methods
public void setHour(int hour){
    this.hour = hour;
}
public void setMinute(int minute){
    this.minute = minute;
}
public void setSecond(int sec){
    this.sec = sec;
}

public void setTime(int hour, int minute, int sec) {
    this.hour = hour;
    this.minute = minute;
    this.sec = sec;
}

public String toString() {
    return String.format("%02d/%02d/%04d", this.hour, this.minute, this.sec);
}
// method to add 1 advance 1 second, should this go over 60, add a minute and set seconds to 0, same for minutes and hours to ensure a valid time.
public void nextSecond(){
 this.sec+= 1; 

    if (this.sec >= 60) {
        this.sec = 0;  
        this.minute+= 1;    

        if (this.minute >= 60) {
            this.minute = 0;
            this.hour+= 1;

            if (this.hour >= 24) {
                this.hour = 0;  
}}}}
// method of subracting once second, following the opposite rules of the addition, to ensure a valid time.
public void previousSecond() {
    this.sec-=1;  

    if (this.sec < 0) {
        this.sec = 59;  
        this.minute-=1;     

        if (this.minute < 0) {
            this.minute = 59;  
            this.hour-=1;       

            if (this.hour < 0) {
                this.hour = 23;  
            }}}}

}














