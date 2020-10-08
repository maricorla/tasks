package com.marina.tasks;

public class PieceOfTime {

    private int seconds;
    private int minutes;
    private int hours;
    final int SECONDS_IN_MIN = 60;
    final int MINUTES_IN_HOUR = 60;


    public PieceOfTime(int hours, int minutes, int seconds){
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;

    }

    public PieceOfTime(int sec){
       int hours = sec/MINUTES_IN_HOUR/SECONDS_IN_MIN;
      int minutes = (sec - hours*MINUTES_IN_HOUR*SECONDS_IN_MIN) / SECONDS_IN_MIN;
      int seconds = (sec - hours*MINUTES_IN_HOUR*SECONDS_IN_MIN) % SECONDS_IN_MIN;
        this.seconds = seconds;
        this.hours = hours;
        this.minutes = minutes;

    }

    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int countSeconds(){

        int resultSeconds = (hours* MINUTES_IN_HOUR*SECONDS_IN_MIN)+(this.minutes*SECONDS_IN_MIN)+this.seconds;
        return resultSeconds;
    }

    public String countSpanHoursSec(){
        String result  = this.hours +"h " + this.minutes+ "min " + this.seconds +"sec";
        return result;

    }

    /**
     * my method
     *
     * @param first obj
     *
     * @param second obj
     *
     * @return 0 -> equal, -1 -> first bigger; 1 -> first less
      */
    public static int compareObjects(PieceOfTime my1, PieceOfTime my2){
        int result;
        if(my1.countSeconds()==my2.countSeconds()){
            result = 0;
        }else if(my1.countSeconds()>my2.countSeconds()){
            result = -1;
        }else{ result = 1;}
        return result;


       /* if(my1.countSeconds()==my2.countSeconds()){
            System.out.println(my1.countSpanHoursSec() + " equal to " +my2.countSpanHoursSec() );
        }else if(my1.countSeconds()>my2.countSeconds()){
            System.out.println(my1.countSpanHoursSec() + " greater than " +my2.countSpanHoursSec() );
        }else{
            System.out.println(my2.countSpanHoursSec() + " greater than " +my1.countSpanHoursSec());
        }*/


    }

}
