package top.lwzp.test.main;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import top.lwzp.test.vo.JsonTestVo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RunAsMain {
    public static void main(String[] args) throws IOException {
        testJackson();
    }

    private static void testJackson() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        ArrayNode arrayNode = mapper.createArrayNode();
//        ObjectNode objectNode = mapper.createObjectNode();
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ArrayNode arrayNode = factory.arrayNode();
        ObjectNode objectNode = factory.objectNode();
    }
}
