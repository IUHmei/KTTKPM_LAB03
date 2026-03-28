package buoi3.adapter_pattern;

public class XMLToJSONAdapter implements JSONService {

    private XMLService xmlService;

    public XMLToJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getJSON() {
        String xml = xmlService.getXML();
        return "{ \"data\": \"" + xml + "\" }";
    }
}
