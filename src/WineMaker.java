import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WineMaker implements NewWine {
    private Wine [] whatWine;
    private int workExperiance;
    private String workAddress;


    public WineMaker(Wine [] whatWine, int workExperiance, String workAddress) {
        this.whatWine = whatWine;
        this.workExperiance = workExperiance;
        this.workAddress = workAddress;
    }

    public Wine [] getWhatWine() {
        return whatWine;
    }

    public void setWhatWine(Wine [] whatWine) {
        this.whatWine = whatWine;
    }

    public int getWorkExperiance() {
        return workExperiance;
    }

    public void setWorkExperiance(int workExperiance) {
        this.workExperiance = workExperiance;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public Wine newWine(Wine[] wines) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("name?");
        String name=scanner.nextLine();
        System.out.println("brand?");
        String brand=scanner.nextLine();
        System.out.println("country?");
        String country=scanner.nextLine();
        System.out.println("date?");
        LocalDate date=LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        Wine wine =new Wine(name,brand,country,date);
        return wine;
    }

    @Override
    public String toString() {
        return "WineMaker: " +
                "\nwhatWine=" + Arrays.toString(whatWine) +
                "\nworkExperiance=" + workExperiance +
                "\nworkAddress='" + workAddress         ;
    }
}
