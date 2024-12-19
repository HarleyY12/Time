public class Main
{
    public static void main(String[] args) {
        Time time1 = new Time(18,5,59);
        System.out.println("Expected result : 18:05:59 ");
        System.out.println("Actual result : " + time1);
        time1.tick();
        System.out.println("Expected result : 18:06:00 ");
        System.out.println("Actual result : " + time1);
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println("Expected result : 18:06:03 ");
        System.out.println("Actual result : " + time1);
        Time time2 = new Time(6,50,35);
        System.out.println("Expected result : 06:50:35 ");
        System.out.println("Actual result : " + time2);
        Time time3 = new Time(23,59,59);
        time3.tick();
        System.out.println("Expected result : 00:00:00 ");
        System.out.println("Actual result : " + time3);
        time3.tick();
        System.out.println("Expected result : 00:00:01 ");
        System.out.println("Actual result : " + time3);
        Time time4 = new Time(14,56,6);
        System.out.println("Expected result : 14:56:06 ");
        System.out.println("Actual result : " + time4);
        time4.tick();
        time4.tick();
        time4.tick();
        time4.tick();
        time4.tick();
        System.out.println("Expected result : 14:56:11 ");
        System.out.println("Actual result : " + time4);
        time4.add(time1);
        System.out.println("Expected result : 09:02:14 ");
        System.out.println("Actual result : " + time4);
        System.out.println("Expected result : 18:06:03 ");
        System.out.println("Actual result : " + time1);
        Time time5 = new Time(0,0,0);
        time5.add(time2);
        System.out.println("Expected result : 06:50:35");
        System.out.println("Actual result " + time5);
    }
}
