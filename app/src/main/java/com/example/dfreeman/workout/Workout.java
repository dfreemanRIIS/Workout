package com.example.dfreeman.workout;

public class Workout {
    private final String name;
    private final String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand pushups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length", ".31 mile run\n21 1.5 pood kettleball swing\n21 Pull-ups")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.name;
    }
}
