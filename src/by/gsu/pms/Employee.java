package by.gsu.pms;

public class Employee {
    private static int DailyAllowance = 69;
    private String account;
    private int transport_cost;
    private int number_of_days;

    public Employee(String account, int transport_cost, int number_of_days) {
        this.account = account;
        this.transport_cost = transport_cost;
        this.number_of_days = number_of_days;
    }

    public Employee() {
        this.account = "Name";
        this.transport_cost = 0;
        this.number_of_days = 1;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport_cost() {
        return transport_cost;
    }

    public void setTransport_cost(int transport_cost) {
        this.transport_cost = transport_cost;
    }

    public int getNumber_of_days() {
        return number_of_days;
    }

    public void setNumber_of_days(int number_of_days) {
        this.number_of_days = number_of_days;
    }

    public float get_total(){
        if (number_of_days==1){
            return transport_cost;
        } else {
            return DailyAllowance * number_of_days + transport_cost;
        }
    }

    public void show(){
        System.out.println(" - - - - - - - ");
        System.out.println("Daily Allowance = " + DailyAllowance);
        System.out.println("Account = " + account);
        System.out.println("Transport cost = " + transport_cost);
        System.out.println("Days = " + number_of_days);
        System.out.println("Total = " + get_total());
    }

    public String to_string(){
        return DailyAllowance +";"+ account+";"+transport_cost+";"+number_of_days+";"+get_total();
    }
}

