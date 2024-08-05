package main.java.com.vasylwecek.basepatterns.structural.adapter;
import org.json.JSONObject;
import org.json.XML;
public class XMLToJSONData implements JSONData{
    private XMLData xmlData;

    public XMLToJSONData(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJSON() {
        JSONObject jsonObject = XML.toJSONObject(xmlData.getXML());
        return jsonObject.toString(4);
    }
}
