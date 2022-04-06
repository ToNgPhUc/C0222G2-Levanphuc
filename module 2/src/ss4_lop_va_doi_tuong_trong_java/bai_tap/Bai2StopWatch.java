package ss4_lop_va_doi_tuong_trong_java.bai_tap;




public class Bai2StopWatch {

    private long startTime;
    private long endTime;
    int starTime1;

    public Bai2StopWatch() {
        Bai2StopWatch stop = new Bai2StopWatch();
        System.out.println(stop.getElapsedTime());
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
    public void StarTime(){
        System.out.println(java.time.LocalTime.now());
    }


    public void Star(long startTime,long endTime) {
this.startTime= startTime;
    }

    public void Stop(long startTime,long endTime) {
        this.endTime = endTime;

    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }


}