package com.company;
/*Skriv en klasse der hedder Billet, som indeholder attributterne udstedelsestidspunkt
(som angiver dato og klokkeslæt for hvornår billetten blev skabt i systemet), varighed ( i hele timer), pris pr. time og et id.
Sørg for at id reflekterer hvilket nummer i rækken billetten er, ud af alle oprettede billetter i systemet.

• Skriv en toString metode der sikrer at billetten bliver udskrevet pænt.
• Skriv metoden getPris som returnerer billettens pris.
• Skriv metoden erGyldig der returnerer false hvis billetten er udløbet.

Skriv test til er Gyldig-metoden og getPris-metoden.

Hvis du har tid …
Skriv en klasse der hedder BilletSystem med metoden opretBillet der tager en varighed i hele timer,
og en pris pr time som parametre. Varigheden af en billet kan max være 24 timer – hvis man forsøger at oprette
en billet med en længere varighed kastes en exception.
Når der oprettes en billet lægges den i en ArrayList.
Skriv en test til opretBillet.
Skriv en metode getBilletter der returnerer listen af billetter sorteret efter pris.*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Billet {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
    private LocalDateTime udstedelsestidspunkt;
    private int varighed;
    private double prisPrTime;
    private int ID;
    static int counter = 1;

    public Billet(int varighed, double prisPrTime) {
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));
        this.udstedelsestidspunkt = now;
        this.varighed = varighed;
        this.prisPrTime = prisPrTime;
        this.ID = counter;
        counter++;
    }
    public boolean erGyldig(){
        LocalDateTime TestDateTime=LocalDateTime.now();//or whatever
        LocalDateTime newTestDateTime = TestDateTime.plusHours(1);


       //Test date and time System.out.println(dtf.format(newTestDateTime));
        LocalDateTime ticketValidDateTime=getUdstedelsestidspunkt().plusHours(getVarighed());
       //Valid Ticket date and time System.out.println(dtf.format(ticketValidDateTime));
        if (ticketValidDateTime.isAfter(newTestDateTime)){
            return true;
        }
        return false;
    }
    public double getPris() {
        return prisPrTime*varighed;
    }
    public LocalDateTime getUdstedelsestidspunkt() {
        return udstedelsestidspunkt;
    }

    public int getVarighed() {
        return varighed;
    }

    public double getPrisPrTime() {
        return prisPrTime;
    }

    public int getID() {
        return ID;
    }

    /*@Override
    public String toString() {
        return String.format("Billet ID: %d:\n" +
                        "\tudstedelsestidspunkt:\t\t%s\n" +
                        "\tvarighed:\t\t%s\n" +
                        "\tprisPrTime:\t%d\n",
                ID);
    }*/

    @Override
    public String toString() {
        return "Billet ID: " + ID +
                ", udstedelsestidspunkt=" + dtf.format(udstedelsestidspunkt) +
                ", varighed=" + varighed +
                ", prisPrTime=" + prisPrTime + "\n";
    }
}
