package ReadAndWrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PropertyFileReader {

    static String path = "\\src\\ReadAndWrite\\test.properties";
    static String writerPath = "\\src\\ReadAndWrite\\writer.properties";
    static String csvWriterPath = "\\src\\ReadAndWrite\\csvData.csv";
    static String txtWriterPath = "\\src\\ReadAndWrite\\txtData.txt";
    static FileWriter fileWriter;
    static BufferedWriter bufferedWriter = null;
    static BufferedReader bufferedReader;
    static FileReader fileReader;

    public static void main(String[] args) throws IOException {
        readFileOnProperties();
        writeFileOnProperties();
        writeDataToTxtFile();
        writeDataToCsvFile();
        readDataFromTxtFile();
        readDataFromCsvFile();
        readText();
    }

    public static void readFileOnProperties() throws IOException {
        // You can use either FileReader or FileInputStream to read a data. However, FileInputStream

        // is used when reading a raw data or stream of byte/data
        // create a fileReader obj
        // FileReader file = new FileReader(System.getProperty("user.dir").concat(path));

        // fileInputStream
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir").concat(path));
        //property
        Properties properties = new Properties();
        // load and read data
        properties.load(fis);
        var keys = properties.keySet();
        for (var key : keys) {
            System.out.println(properties.getProperty(key.toString()));
        }
    }
    public static void writeFileOnProperties() throws IOException {
        // writerObject
        fileWriter = new FileWriter(System.getProperty("user.dir").concat(writerPath), true);
        // Properties
        Properties propertiesWriter = new Properties();
        //write whatever you want to write using key and value pair combination
        // e.g. key is "contact us " and  value is "54 Hackwood Road Basingstoke"
        propertiesWriter.setProperty("contactUs ", "54 Hackwood Road Basingstoke");
        // System.out.println(contactUs);
        propertiesWriter.store(fileWriter, "this is just a test comment");
    }

    public static void writeDataToTxtFile() throws IOException {
        // filewriter ->
        // get the path/location to write to
        fileWriter = new FileWriter(System.getProperty("user.dir").concat(txtWriterPath));

        // open the location
        bufferedWriter = new BufferedWriter(fileWriter);

        //write
        bufferedWriter.write("This is my message to you to let you know that I care ");
        //close
        bufferedWriter.close();
    }

    public static void writeDataToCsvFile() throws IOException {
        fileWriter = new FileWriter(System.getProperty("user.dir").concat(csvWriterPath));
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("What is going on bruv");
        bufferedWriter.close();
    }

    public static void readDataFromTxtFile() throws IOException {
        // document path
        fileReader = new FileReader(System.getProperty("user.dir").concat(txtWriterPath));
        //open the document
        bufferedReader = new BufferedReader(fileReader);
        do {
            System.out.println(bufferedReader.readLine());
        } while (!bufferedReader.readLine().isBlank());

        // close buffered
        bufferedReader.close();


    }

    public static void readDataFromCsvFile() throws IOException {

        fileReader = new FileReader(System.getProperty("user.dir").concat(csvWriterPath));

        bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        do {
            System.out.println(bufferedReader.readLine());
        } while (!bufferedReader.readLine().isEmpty());
        bufferedReader.close();


    }

    public static void readText()
            throws IOException {
        File file = new File(System.getProperty("user.dir").concat(csvWriterPath));
        // System.out.println(file.canRead());
        if (file.canRead()) {
            var lines = Files.readAllLines(file.toPath());
            for (var line : lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("File can't be read");
        }

    }
}