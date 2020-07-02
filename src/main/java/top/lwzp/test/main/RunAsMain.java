package top.lwzp.test.main;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RunAsMain {
    public static void main(String[] args) {
//        Stream stream = Stream.of("aa","ab","ac","bc");
//        List<String> reduce = (List<String>) stream.reduce(new ArrayList<String>(), (a, b) -> {
//            (a).add(b);
//            return a;
//        }, (a,b)->a);
//        System.out.println(reduce);
    }
}
class Person{
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}