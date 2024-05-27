package oop.labor13;

public class Tanfolyam {
    private static int idCounter = 0;
    private int id;
    private String name;
    private double price;
    private Date startDate;

    public Tanfolyam( String name, double price, Date startDate) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tanfolyam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                '}';
    }
}


