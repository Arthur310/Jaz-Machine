/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazmachine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Son
 */
public class Analyzer {
    public static List<CodeType> parseFile(String filename)
            throws IOException {
        List<CodeType> list = new ArrayList<CodeType>();
        String[] parts = new String[2];
        File file = new File(filename);
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                parts = line.split(" ", 2);
                switch(parts.length) {
                    case 1:
                        list.add(new CodeType(parts[0].trim()));
                        break;

                    case 2:
                        list.add(new CodeType(parts[0].trim(), parts[1].trim()));
                        break;
                }
            }
        }
        return list;
    }
}
