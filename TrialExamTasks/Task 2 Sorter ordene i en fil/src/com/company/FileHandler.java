package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*•       Skriv en klasse med en metode der læser en fil og returnerer en ArrayList med de ord filen indeholder.
Sørg for at alle ord er lowercase inden de tilføjes til listen.
•       Skriv en anden metode der sorterer ordene efter længden af ordet, fjerner dubletter og skriver dem til filen igen.
Hvis du har tid …

•       Skriv en metode der tæller hvor mange gange hvert ord forekommer i filen, og returnerer resultatet som en Map.
•       Skriv en metode der returnerer hvilket ord der forekommer flest gange.
*/
public class FileHandler {

    public static ArrayList fileToArraylist(){
        ArrayList<String> wordsArray = new ArrayList<>();
        try {
            File myObj = new File("src/Test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine().toLowerCase();
                wordsArray.add(data);
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return wordsArray;
    }

    public static void cleanUp(ArrayList<String> wordsArray) {
        //Sorting
        System.out.println("Before sorting: ");
        System.out.println(wordsArray);
        Collections.sort(wordsArray, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });
        System.out.println("After sorting: ");
        System.out.println(wordsArray);

        //Deletes doublets
        // Create a new ArrayList
        ArrayList<String> newWordsArray = new ArrayList<>();
        for (String word : wordsArray) {

            // If this element is not present in newList
            // then add it
            if (!newWordsArray.contains(word)) {
                newWordsArray.add(word);
            }
        }

        Path out = Paths.get("src/Test.txt");
        try {
            Files.write(out,newWordsArray, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String mostFrequentWord(ArrayList<String> wordsArray){
        String s="";

        return s;
    }
}
