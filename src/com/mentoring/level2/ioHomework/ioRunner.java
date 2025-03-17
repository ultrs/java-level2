package com.mentoring.level2.ioHomework;
/*
Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.

Желательно реализовать доп. функционал:
Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.mentoring.level2.ioHomework.IOUtil.*;


public class ioRunner {



    public static void main(String[] args) throws IOException {

        File itemsName = Path.of("resources", "items-name.csv").toFile();
        File itemsPrice = Path.of("resources", "items-price.csv").toFile();
        Path result = Path.of("resources", "result.csv");

        getResultFile(getResultList(csvToList(itemsPrice), csvToList(itemsName)), result);



    }



}
