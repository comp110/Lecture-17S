package comp110.lecture26;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class FoodRunner {

  public static void main(String[] args) throws IOException {

    // Read in Data as Input
    Reader in = new FileReader("data/chase-2017-04-21.csv");
    Iterable<CSVRecord> records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);

    Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
    for (CSVRecord record : records) {

      String name = record.get("name");
      double calories = Double.parseDouble(record.get("calories"));
      double protein = Double.parseDouble(record.get("protein"));
      double carbs = Double.parseDouble(record.get("carbs"));
      double fat = Double.parseDouble(record.get("fat"));
      boolean organic = Boolean.parseBoolean(record.get("organic"));
      boolean vegetarian = Boolean.parseBoolean(record.get("vegetarian"));
      boolean glutenFree = Boolean.parseBoolean(record.get("glutenFree"));
      boolean vegan = Boolean.parseBoolean(record.get("vegan"));

      MenuItem item = new MenuItem(record.get("name"));
      item.setCalories(calories);
      item.setProtein(protein);
      item.setCarbs(carbs);
      item.setFat(fat);
      item.setOrganic(organic);
      item.setVegetarian(vegetarian);
      item.setGlutenFree(glutenFree);
      item.setVegan(vegan);

      menu.put(name, item);
    }

    // Process Data
    List<MenuItem> filtered = new ArrayList<MenuItem>();
    for (MenuItem item : menu.values()) {
      if (item.getFat() == 0) {
        filtered.add(item);
      }
    }

    // Sort Data
    filtered.sort(new CompareByProtein());

    // Write Data as Output
    FileWriter writer = new FileWriter("data/chase-results.csv");
    CSVPrinter printer = new CSVPrinter(writer, CSVFormat.EXCEL);
    for (MenuItem item : filtered) {
      printer.printRecord(item.getName(), item.getProtein());
    }
    writer.close();

  }

}
