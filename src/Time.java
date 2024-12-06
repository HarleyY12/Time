public class Time {
    private String initialTime;
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
        if(seconds >= 60){
            seconds = 0;
            minutes = minutes + 1;
        }
        if (minutes == 60){
            minutes = 0;
            hours = hours + 1;
        }
    }
    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
        }
    }

