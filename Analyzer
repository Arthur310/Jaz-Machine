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
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Son
 */
public class Analyzer {
    List<CodeType> list = new ArrayList<CodeType>();
    void ParseFile(String filename) {
        try {
            String[] parts = new String[2];
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                parts = line.split(" ", 2);
                CodeType codetype = new CodeType(parts[0], parts[1]);
                list.add(codetype);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
	}
    }
    
    public class CodeType {
        String instruction;
        String parameter;
        CodeType() {
            instruction = "";
            parameter = "";
        }
        
        CodeType (String Instruction, String Parameter) {
            instruction = Instruction;
            parameter = Parameter;
        }    
    }    
}
