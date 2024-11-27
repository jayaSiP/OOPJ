import java.util.*;

class time {
    int hours;
    int minutes;
    time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    time addtime(time t2) {
        int totalMinutes = this.minutes + t2.minutes;
        int hours = this.hours + t2.hours;
        hours += totalMinutes / 60;
        totalMinutes %= 60;
        return new time(hours, totalMinutes);
    }

    void displaytime() {
        System.out.printf("%02d:%02d%n", hours, minutes);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours for first time: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for first time: ");
        int minutes1 = scanner.nextInt();

        System.out.print("Enter hours for second time: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for second time: ");
        int minutes2 = scanner.nextInt();

        time time1 = new time(hours1, minutes1);
        time time2 = new time(hours2, minutes2);

        time result = time1.addtime(time2);

        System.out.println("Resultant time:");
        result.displaytime();
    }
}