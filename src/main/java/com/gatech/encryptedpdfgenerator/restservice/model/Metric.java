package com.gatech.encryptedpdfgenerator.restservice.model;


import com.gatech.encryptedpdfgenerator.restservice.dtos.MetricDto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "metrics")
public class Metric {
    @Id
    @Column(name = "metric_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "weight")
    private Integer weight;
    @Column(name = "systolic")
    private Integer systolic;
    @Column(name = "diastolic")
    private Integer diastolic;
    @Column(name = "sleep")
    private Integer sleep;
    @Column(name = "activity")
    private Integer activity;
    @Column(name = "squality")
    private Integer sleepQuality; //1,2,3 could be enum but int is fine for npw
    @Column(name = "fquality")
    private Integer foodQuality; //1,2,3 could be enum but int is fine for npw
    @Column(name = "aquality")
    private Integer activityQuality; //1,2,3 could be enum but int is fine for npw
    @Column(name = "date")
    private Date dateTime;
    @Column(name = "age")
    private Integer age;
    @Column(name = "height")
    private Integer height;
    @Column(name = "guid")
    private String guid;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSystolic() {
        return systolic;
    }

    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getSleepQuality() {
        return sleepQuality;
    }

    public void setSleepQuality(Integer sleepQuality) {
        this.sleepQuality = sleepQuality;
    }

    public Integer getFoodQuality() {
        return foodQuality;
    }

    public void setFoodQuality(Integer foodQuality) {
        this.foodQuality = foodQuality;
    }

    public Integer getActivityQuality() {
        return activityQuality;
    }

    public void setActivityQuality(Integer activityQuality) {
        this.activityQuality = activityQuality;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public static Metric to(MetricDto metricDto){
        Metric metric = new Metric();
        metric.activity = metricDto.getActivity();
        metric.activityQuality = metricDto.getActivityQuality();
        metric.age = metricDto.getAge();
        metric.weight =metricDto.getWeight();
        metric.systolic= metricDto.getSystolic();
        metric.diastolic = metricDto.getDiastolic();
        metric.sleep = metricDto.getSleep();
        metric.sleepQuality = metricDto.getSleepQuality();
        metric.foodQuality =metricDto.getFoodQuality();
        metric.dateTime = metricDto.getDateTime();
        metric.height = metricDto.getHeight();
        metric.guid = metricDto.getGuid();
        return metric;
    }
}
