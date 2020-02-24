package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.AbstractBaseEntity;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;

public class MealTestData {
    public static final int MEAL1_ID = AbstractBaseEntity.START_SEQ + 2;

    public static final Meal MEAL1 = new Meal(MEAL1_ID, LocalDateTime.of(2020 , 1, 30, 10, 0), "завтрак", 500);
    public static final Meal MEAL2 = new Meal(MEAL1_ID + 1, LocalDateTime.of(2020 , 1, 30, 14, 0), "обед", 1000);
    public static final Meal MEAL3 = new Meal(MEAL1_ID + 2, LocalDateTime.of(2020 , 1, 30, 20, 0), "ужин", 500);
    public static final Meal MEAL4 = new Meal(MEAL1_ID + 3, LocalDateTime.of(2020 , 1, 31, 10, 0), "завтрак", 500);
    public static final Meal MEAL5 = new Meal(MEAL1_ID + 4, LocalDateTime.of(2020 , 1, 31, 14, 0), "обед", 500);
    public static final Meal MEAL6 = new Meal(MEAL1_ID + 5, LocalDateTime.of(2020 , 1, 31, 21, 0), "ужин", 520);
    public static final Meal ADMIN_MEAL1 = new Meal(MEAL1_ID + 6, LocalDateTime.of(2020 , 1, 1, 14, 0), "Админ ланч", 510);
    public static final Meal ADMIN_MEAL2 = new Meal(MEAL1_ID + 7, LocalDateTime.of(2020 , 1, 1, 21, 0), "Админ ужин", 1500);

    public static Meal getCreated() {
        return new Meal(null, LocalDateTime.of(2020,1,2,10,0), "created", 400);
    }

    public static Meal getUpdated() {
        Meal updated = new Meal(MEAL1);
        updated.setDescription("Updated lunch");
        return updated;
    }
}
