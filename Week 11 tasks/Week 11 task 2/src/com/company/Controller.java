package com.company;

public class Controller {
    Dialog dialog;
    Vat vat;
    View view;
    final static String MSG = "MOMS";


    public Controller(){
        this.dialog= new Dialog();
        this.vat= new Vat();
        this.view=new View();

    }

    void runController() {
        double userIn = dialog.doDiag();
        double vatAmount = vat.doVAT(userIn);
        view.doView(vatAmount,MSG);
    }
}
