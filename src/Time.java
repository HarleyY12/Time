public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
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
    public String toString(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
}
