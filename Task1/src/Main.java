import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Wine {

    private String name;
    private String trademark;
    private String countryMaker;
    private LocalDate productionDate;
    private String description;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM YYYY");

    public Wine() {

    }

    public Wine(String name, String trademark, String countryMaker, LocalDate productionDate, String description) {
        this.name = name;
        this.trademark = trademark;
        this.countryMaker = countryMaker;
        this.productionDate = productionDate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCountryMaker() {
        return countryMaker;
    }

    public void setCountryMaker(String countryMaker) {
        this.countryMaker = countryMaker;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printInfo(Wine wine) {
        Period p1 = Period.between(wine.productionDate, LocalDate.now());
        long l1 = ChronoUnit.YEARS.between(wine.productionDate, LocalDate.now());
        System.out.println("Wine: " + wine.name + ". Trade make: " + wine.trademark + ". Country maker: " + wine.countryMaker + ". Date production: " +
                wine.productionDate.format(format) + ". Description: " + wine.description + ". Exposure time in years: " + l1);
    }
}

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        LocalDate d1 = LocalDate.of(2010, 5, 15);
        Period per = Period.between(d1, LocalDate.now());
        Wine w1 = new Wine("Porto", "VN", "Russia", d1, "Сухое полусладкое");
        w1.printInfo(w1);
    }
}