package individualTask.warehouse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> List<T> getListOfObjects(String fileURL, Class <T> type) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileURL));

        JsonNode jsonNode;
        List<T> listOfObjects = new ArrayList<>();

        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            jsonNode = JsonReader.parse(jsonObject.toString());
            listOfObjects.add(JsonReader.fromJson(jsonNode, type));
        }
        return listOfObjects;
    }

    private static JsonNode parse(String src) throws JsonProcessingException {
        return objectMapper.readTree(src);
    }

    private static <T> T fromJson(JsonNode node, Class<T> type) throws JsonProcessingException {
        return objectMapper.treeToValue(node, type);
    }
}
