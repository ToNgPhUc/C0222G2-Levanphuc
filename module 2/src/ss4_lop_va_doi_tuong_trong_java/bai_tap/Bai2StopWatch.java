package ss4_lop_va_doi_tuong_trong_java.bai_tap;


public class Bai2StopWatch {

    private long startTime;
    private long endTime;

    public Bai2StopWatch() {

    }

    public Bai2StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void Start() {
        this.startTime = System.currentTimeMillis();
    }

    public void Stop() {
        this.endTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
       Bai2StopWatch stop=new Bai2StopWatch();
       stop.Start();
       int a=100000;

        for (int i = 0; i < a; i++) {
      a++;

        }stop.Stop();
        System.out.println(stop.getElapsedTime());

    }
}