package com.cdmg_tapas.features.tapas.domain;

public class Tapa {

    private String id;
    private String name;
    private String participations;
    private String totalPoints;
    private String votes;
    private String ingredients;

    public Tapa(String id, String name, String participations, String totalPoints, String votes, String ingredients) {
        this.id = id;
        this.name = name;
        this.participations = participations;
        this.totalPoints = totalPoints;
        this.votes = votes;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipations() {
        return participations;
    }

    public void setParticipations(String participations) {
        this.participations = participations;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return  "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Participations: " + participations + "\n" +
                "Total Points: " + totalPoints + "\n" +
                "Votes: " + votes + "\n" +
                "Ingredients: " + ingredients + "\n" + "\n";
    }
}
