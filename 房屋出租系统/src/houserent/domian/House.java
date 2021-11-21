package houserent.domian;

public class House {
    private int id;
    private String host;
    private String number;
    private String address;
    private int rent;
    private String status;

    //constructor
    public House(int id, String host, String number, String address, int rent, String status) {
        this.id = id;
        this.host = host;
        this.number = number;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }
    public House() {
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //getter
    public int getId() {
        return id;
    }

    public String getHost() {
        return host;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public int getRent() {
        return rent;
    }

    public String getStatus() {
        return status;
    }
}
