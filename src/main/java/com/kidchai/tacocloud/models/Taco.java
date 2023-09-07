package com.kidchai.tacocloud.models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    private Date createdAt = new Date();

    @Size(min = 1, message = "You need to choose at least 1 ingredient")
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
