import java.util.Scanner;

  public class clock {

    private int hour;
    private int minute;
    private int second;

    public void  time(int h, int m, int s){

        if ( h >= 0 && h <= 23){
            hour = h;
        }else{
            System.out.println("Invavild hour");
        }

        if( m >= 0 && m <= 59){
            minute = m;
        }else{
            System.out.println("Invalid minute");
        }

        if(s >= 0 && s <= 59){
            second = s;
        }else{
            System.out.println("Invalid second");
        }
    }

    public clock(){

    }
      
    public clock(int h, int m, int s){

        hour = h;
        minute = m;
        second = s;
    }

    public int gethour(){
        return hour;
    }

    public int getminute(){
        return minute;
    }

    public int getsecond(){
        return second;
    }

    public void sethour(int h){
        hour = h;
    }

    public void setminute(int m){
        minute = m;
    }

    public void setsecond(int s){
        second = s;
    }


}
