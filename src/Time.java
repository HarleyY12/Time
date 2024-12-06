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
    public String addTime(){
        return "e";

    }
    public String toString(){
        String newFormat = "";
        if (hours <=9){
            newFormat = "0"+hours + ":" + minutes + ":" + seconds;

        }if (minutes<=9){
            newFormat = hours + ":0" + minutes + "seconds:" + seconds;
        }
        if (seconds <= 9){
            newFormat = hours + "::" + minutes + ":0" + seconds;
        }
        return newFormat;
        }
    }
