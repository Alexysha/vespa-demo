package ru.sportmaster.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Food extends Product {

    List<String> composition;

    Nutritional nutritional;

    Energy energy;

    @JsonProperty("GOST")
    boolean GOST;

    @Data
    @FieldDefaults(level = PRIVATE)
    public static class Nutritional {

        float squirrels;

        float fats;

        float carbohydrates;
    }

    @Data
    @FieldDefaults(level = PRIVATE)
    public static class Energy {

        int joules;

        int kcal;
    }
}