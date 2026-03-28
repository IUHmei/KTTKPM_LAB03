package buoi3.adapter_pattern;

public class Main {
    public static void main(String[] args) {

        XMLService xml = new XMLService();
        JSONService adapter = new XMLToJSONAdapter(xml);

        System.out.println(adapter.getJSON());
    }
}
