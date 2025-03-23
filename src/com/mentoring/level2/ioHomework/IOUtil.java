package com.mentoring.level2.ioHomework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtil {
    public static final String COMMA_DELIMITER = ",";


    public static List<List<String>> csvToList(File file) throws FileNotFoundException {
        List<List<String>> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                result.add(getValuesFromLine(scanner.nextLine()));
            }
        }
        return result;
    }

    private static List<String> getValuesFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner valuesScanner = new Scanner(line)) {
            valuesScanner.useDelimiter(COMMA_DELIMITER);
            while (valuesScanner.hasNext()) {
                values.add(valuesScanner.next());
            }
        }
        return values;
    }

    public static List<String> getResultList(List<List<String>> price, List<List<String>> name) throws IOException {
        List<String> result = new ArrayList<>();
        String forAdd;
        result.add("ID,NAME,PRICE");
        for (int i = 1; i < name.size(); i++) {
            forAdd = name.get(i).get(0);
            forAdd += COMMA_DELIMITER;
            forAdd += name.get(i).get(1);
            forAdd += COMMA_DELIMITER;
            for (int j = 1; j < price.size(); j++) {
                if (price.get(j).get(0).equals(name.get(i).get(0))) { //нельзя ==, нужен .equals
                    forAdd += price.get(j).get(1);
                }
            }
            result.add(forAdd);
        }
        if (result.size() != name.size() || result.size() != price.size()) {
            createErrorFile(name, price);

        }
        return result;
    }

    public static void getResultFile(List<String> forPrint, Path result) throws IOException {
        try (BufferedWriter fileWriter = Files.newBufferedWriter(result)) {
            for (int i = 0; i < forPrint.size(); i++) {
                fileWriter.write(forPrint.get(i));
                fileWriter.newLine();
            }
        }
    }

    private static void createErrorFile(List<List<String>> firstList, List<List<String>> secondList) throws IOException {
        Path result = Path.of("resources", "errors.csv");
        List<String> errorResultList = new ArrayList<>();
        errorResultList.add("ID");
        errorResultList.addAll(getErrorsIDList(firstList, secondList));
        errorResultList.addAll(getErrorsIDList(secondList, firstList));
        getResultFile(errorResultList, result);
    }

    private static List<String> getErrorsIDList(List<List<String>> firstList, List<List<String>> secondList){
        List<String> errorResultList = new ArrayList<>();
        int flag = 0;
        for (int i = 1; i < firstList.size(); i++) {
            for (int j = 1; j < secondList.size(); j++) {
                if (firstList.get(i).get(0).equals(secondList.get(j).get(0))) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                errorResultList.add(firstList.get(i).get(0));
            }
            flag = 0;
        }
        return errorResultList;
    }

}
