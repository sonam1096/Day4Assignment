package Day4Assignment;

 

class Time{
  public int hour;
  public int min; 
  public int sec;
  
  Time(){}
   Time(int h, int m, int s) {
    
    this.hour = h;
    this.min = m;
    this.sec = s;
  }


  public int getHour() {
    return hour;
  }


  public void setHour(int hour) {
    this.hour = hour;
  }


  public int getMin() {
    return min;
  }


  public void setMin(int min) {
    this.min = min;
  }


  public int getSec() {
    return sec;
  }


  public void setSec(int sec) {
    this.sec = sec;
  }
  public int getInSec() {
    return hour*3600+min*60+sec;
  }

  
  
  public Time add (Time t) {
    Time z =new Time();
    int totalSeconds = getInSec() + t.getInSec();
        z.setHour( (totalSeconds / 3600)%24);
        z.setMin((totalSeconds % 3600) / 60);
        z.setSec(totalSeconds % 60);
        return z;
        
  }

      
   public String convertIn12Hours() {
      int h = hour;
      String s;
      if(hour==12) {
       h = 12;
       s = "PM";
      }
      else if(hour>12) {
       h = hour%12;
       s = "PM";
      }
      else {
       s = "AM";
      }
      return (h + ":"+min + ":"+sec + s);
     }
     public String toString() {
      return (hour + ":"+min + ":"+sec);
     }
    }


public class que1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Time x =new Time (12,30,25);
    Time y =new Time (11,20,35);
    Time z =x.add(y);
    String timeMessage1=x.convertIn12Hours();
    String timeMessage2=y.convertIn12Hours();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(timeMessage1);
    System.out.println(timeMessage2);
  }

}
