import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine =new Wine("Red","Merlo","Italy", LocalDate.of(1865,2,3));
        Wine wine1=new Wine("White","Santo stefano","Chili",LocalDate.of(1879,2,3));
        Wine wine2=new Wine("Santa Luz","Castillo","Ispan",LocalDate.of(1899,3,13));
        Wine wine3=new Wine("La linda","Malbec","Argentin",LocalDate.of(1956,2,4));
        Wine [] wines = {wine,wine1,wine2,wine3};
        WineMaker wineMaker=new WineMaker(wines,5,"Italy");
        wines[0]=wineMaker.newWine(wines);

        System.out.println(wineMaker.toString());


    }
}