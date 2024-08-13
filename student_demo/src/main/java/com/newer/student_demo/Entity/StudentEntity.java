package com.newer.student_demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="StudentTable")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roll;
    @Column(name = "Name")
    private String name;

    public StudentEntity(){

    }

    public StudentEntity(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Column(name = "Percentage")
    private float percentage;
    @Column(name = "Branch")
    private String branch;

}
