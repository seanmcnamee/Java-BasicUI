package app.backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileAccess {
    private BufferedReader fileIn;

    public FileAccess(String fileName) {
        this.fileIn = getFile(fileName);
    }

    public BufferedReader getFile(String fileName) {
        BufferedReader fileIn = null;
        try {
            fileIn = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileIn;
    }

    public KeyValue getNextPair() {
        KeyValue pair = null;
        try {
            StringTokenizer line = new StringTokenizer(fileIn.readLine());
            pair = new KeyValue(line.nextToken(), line.nextToken());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pair;
    }
}
