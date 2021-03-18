package com.company;

public class Account {
    String transaction_date;
    String product = "";
    float price;
    String payment_Type = "";
    String card_Number;
    String name = "";
    String city = "";
    String state = "";
    String country = "";
    String account_Created = "";
    String last_Login = "";
    double lat;
    double Long;

    public Account(String transaction_date, String product, float price, String payment_Type, String card_Number, String name, String city, String state, String country, String account_Created, String last_Login, double lat, double Long) {
        this.transaction_date = transaction_date;
        this.product = product;
        this.price = price;
        this.payment_Type = payment_Type;
        this.card_Number = card_Number;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.account_Created = account_Created;
        this.last_Login = last_Login;
        this.lat = lat;
        this.Long = Long;
    }

    @Override
    public String toString() {
        String str;
        str= "Account info "+"Name: "+name+", City: "+city+", State: "+state+", Country: "+country + ", Product: "+product+", Price: "+price+", Payment type: "+ payment_Type+ ", Card number: "+card_Number +", Account created: "+account_Created+", Last login: "+last_Login+", Lat "+lat+", Long: "+Long;
        return str;

    }

    public String getCard_Number() {
        return card_Number;
    }

    public void setCard_Number(String str) {

        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ints[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            System.out.println(str + " is a valid credit card number and the credit car number have been changed.");
            this.card_Number = str;
        } else {
            System.out.println(str + " is an invalid credit card number and the credit card number have NOT been changed!!!");
        }
    }
}
