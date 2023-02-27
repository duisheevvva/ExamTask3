import java.time.LocalDate;

public class Wine {
    private String name;
    private String brand;
    private String country;
    private LocalDate pourDate;


    public Wine(String name, String brand, String country, LocalDate pourDate) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.pourDate = pourDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getPourDate() {
        return pourDate;
    }

    public void setPourDate(LocalDate pourDate) {
        this.pourDate = pourDate;
    }

    @Override
    public String toString() {
        return "\n\nWine: " +
                "\nName: " + name +
                "\nBrand: " + brand +
                "\nCountry: " + country +
                "\nPour date: " + pourDate;
    }
}
