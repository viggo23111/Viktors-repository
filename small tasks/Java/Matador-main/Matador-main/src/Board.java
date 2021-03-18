public class Board {


    public Board(){
        setFields();
    }

    private void setFields() {
        String[] config = loadConfig();
        for (int i = 0; i < config.length; i++){
            String [] fieldData=config[i].split(",");

            int fieldId = Integer.parseInt(fieldData[0]);
            String fieldType = fieldData[1].trim();
            String fieldLabel = fieldData[2];
            int fieldCost = Integer.parseInt(fieldData[3]);
            int fieldIncome = Integer.parseInt(fieldData[4]);



        switch(fieldType) {
            case "Start":
                Field field = new Start();
                break;

            case "Land":
                Field field = new Land();
                break;

            case "Event":
                Field field = new Event();
                break;

            case "Tax":
                Field field = new Tax();
                break;

            case "ShippingLine":
                Field field = new ShippingLine();


        }


        }
    }

    private String[] loadConfig() {
        String[] config = new String[6];

        config[0] = "Start, Start,0,4000";
        config[1] = "Land, Rødovrevej, 1200, 100";
        config[2] = "Event, Prøv Lykken, 0, 0";
        config[3] = "Land, Hvidovrevej, 1200, 100";
        config[4] = "Tax, Skat, 4000, 0";
        config[5] = "ShipplingLine, Limfjorden A/S, 4000, 1000";

        return config;
    }

}

/**
 * Config data bør læses fra en fil, fx csv med flg. (eller lign.) format
 *
 * index, type, navn, udgift, indtægt
 * 1, Start, Start,0,30000
 * 2, Land, Rødovrevej, 1200, 100
 * 3, Event, Prøv Lykken, 0, 0
 * 4, Land, Hvidovrevej, 1200, 100
 * 5, Tax, Skat, 4000, 0
 * 6, ShipplingLine, Limfjorden A/S  , 4000,1000
 *
 * */
