package main.java.com.vasylwecek.basepatterns.structural.adapter;

public class TradingApplication {
    public static void main(String[] args) {
        String xmlDataString = "<market><stock><name>ACME</name><price>100</price></stock></market>";
        XMLData xmlData = new XMLData(xmlDataString);

        JSONData jsonData = new XMLToJSONAdapter(xmlData);

        System.out.println("Данные в формате JSON:");
        System.out.println(jsonData.getJSON());

    }
}
