package io.bpoole6.foxholelogitracker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Blah {
    public static void main(String[] args) throws IOException {
        String []items = new String(Files.readAllBytes(Paths.get("te.txt"))).split(System.lineSeparator());
        Arrays.sort(items);
        for (int i = 0; i < items.length - 1; i++) {
            String s = items[i];
            System.out.println(i+","+s.substring(0,s.indexOf("Map") -1));
        }
    }
}
