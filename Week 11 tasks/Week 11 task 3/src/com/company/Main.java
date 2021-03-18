/*Identificer attributter til en Account-klasse i følgende linjer
        Transaction_date,Product,Price,Payment_Type,Card_Number,Name,City,State,Country,Account_Created,Last_Login,Lat,Long
        1/3/09 14:44,Product1,1200,Visa,4593781145107322,Gouya,Echuca,Victoria,Australia,9/25/05 21:13,1/3/09 14:22,-36.1333333,144.75

        Og skriv derpå en konstruktør til klassen som indeholder de felter du mener er nødvendige for at kunne oprette en Account

        Skriv getters og setters – herunder for kreditkort-nummer.
        Instantiér fire konti ud fra flg og læg dem i et array – Account[] myAccounts = new Account[3]:

        1/5/09 11:37,Product1,1200,Visa,4234120954489197,Janet,Ottawa,Ontario,Canada,1/5/09 9:35,1/5/09 19:24,45.4166667,-75.7
        1/5/09 20:00,Product2,3600,Visa,4904344348439820,James,Burpengary,Queensland,Australia,12/10/08 19:53,1/8/09 17:58,-27.1666667,152.95
        1/3/09 13:24,Product1,1200,Visa,4737470823565213,Mehmet Fatih,Helsingor,Frederiksborg,Denmark,1/3/09 12:47,1/9/09 11:14,56.0333333,12.6166667

        Lav en validering i setCreditCard(int creditcardNumber) som tester om kortet opfylder Luhn-tjekket.
        Tjekket går ud på at tage alle cifre startende fra højre og fordoble hvert andet ciffer (hvis større end 9 brug da tværsummen)
        og dernæst tage summen af alle tal – både de fordoblede og dem, der blev sprunget over. Hvis denne sum modulus 10 giver nul opfylder nummeret tjekket.

        Skriv en toString()metode der returnerer en String som, på en pæn måde, indeholder alle værdierne for denne konto.
*/
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account1;
        Account account2;
        Account account3;
        Account account4;
        account1=new Account( "1/3/09 14:44","Product1",1200,"Visa","4593781145107322","Gouya","Echuca","Victoria","Australia","9/25/05 21:13","1/3/09 14:22",-36.1333333,144.75);
        System.out.println(account1.getCard_Number());

        account2=new Account( "1/5/09 11:37","Product1",1200,"Visa","4234120954489197","Janet","Ottawa","Ontario","Canada","1/5/09 9:35","1/5/09 19:24",-27.1666667,152.95);
        System.out.println(account2.getCard_Number());

        account3=new Account( "1/5/09 20:00","Product2",3600,"Visa","4904344348439820","James","Burpengary","Queensland","Australia","12/10/08 19:53","1/8/09 17:58",45.4166667,-75.7);
        System.out.println(account3.getCard_Number());

        account4=new Account( "1/3/09 13:24","Product1",1200,"Visa","4737470823565213","Mehmet Fatih","Helsingor","Frederiksborg","Denmark","1/3/09 12:47","1/9/09 11:14",56.0333333,12.6166667);
        System.out.println(account4.getCard_Number());

        account1.setCard_Number("4593781145107322");
        System.out.println(account1.getCard_Number());
        System.out.println(account1);
    }
}
