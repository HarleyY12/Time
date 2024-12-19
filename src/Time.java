/*Time class represents a 24-hour clock in Military Time
   * It includes hours,minutes, and seconds
   * The tick method increases the time by one second
   * Different time objects can be added
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;
/*Time constructor creates an object with a unique number of hours, minutes and seconds
    * @param hours represents the hour the time is at
    * @param minutes represents the minute the time is at
    * @param seconds represents the second the time is at
 */
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
/*Increases time by one second
 *Readjusts the minutes and hours if conditions are met
 */
    public void tick(){
        seconds = seconds + 1;
        if(seconds == 60){
            seconds = 0;
            minutes = minutes + 1;
        }
        if (minutes == 60){
            minutes = 0;
            hours = hours + 1;
        }
        if (hours == 24){
            hours = 0;
        }
    }
/*Adds time from other time object to current time object
 *@param other represents the other time object to add
 */
    public void add(Time other){
        this.seconds = this.seconds + other.seconds;
        if (this.seconds >= 60){
            this.seconds = this.seconds - 60;
            this.minutes = this.minutes + 1;
        }
        this.minutes = this.minutes + other.minutes;
        if (this.minutes >= 60){
            this.minutes = this.minutes - 60;
            this.hours = this.hours + 1;
        }
        this.hours = this.hours + other.hours;
        if (this.hours >= 24){
            this.hours = this.hours - 24;
        }
    }
/*Returns time in Military Format
 *@return the formatted time as a string
 */
    public String toString(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
}
