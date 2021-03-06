package com.example.bugtracking.bugtracking.object;

import java.sql.Date;

/**
 * Created by Sylvain on 07.11.2015.
 */
public class Bug {
    private int id;
    private String title;
    private String description;
    private String reference;
    private String category;
    private String reproduce;
    private String effects;
    private String priority;
    private String state;
    private String date;
    private int projectId;
    private int devId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReproduce() {
        return reproduce;
    }

    public void setReproduce(String reproduce) {
        this.reproduce = reproduce;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getDevId() {
        return devId;
    }

    public void setDevId(int devId) {
        this.devId = devId;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.title;
    }
}
