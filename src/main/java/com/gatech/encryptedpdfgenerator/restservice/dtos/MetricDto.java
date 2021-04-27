package com.gatech.encryptedpdfgenerator.restservice.dtos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gatech.encryptedpdfgenerator.restservice.model.Metric;

import java.util.Date;
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class MetricDto implements Comparable<MetricDto> {

    private Integer weight;
    private Integer systolic;
    private Integer diastolic;
    private Integer sleep;
    private Integer activity;
    private Integer sleepQuality; //1,2,3 could be enum but int is fine for npw
    private Integer foodQuality; //1,2,3 could be enum but int is fine for npw
    private Integer activityQuality; //1,2,3 could be enum but int is fine for npw
    @JsonFormat(pattern = "MMM dd',' YYYY HH:mm:ss a")
    private Date dateTime;
    private Integer age;
    private Integer height;
    private String guid;

    public static MetricDto from(Metric metric){
        MetricDto metricDto = new MetricDto();
        metricDto.activity = metric.getActivity();
        metricDto.activityQuality = metric.getActivityQuality();
        metricDto.age = metric.getAge();
        metricDto.weight =metric.getWeight();
        metricDto.systolic= metric.getSystolic();
        metricDto.diastolic = metric.getDiastolic();
        metricDto.sleep = metric.getSleep();
        metricDto.sleepQuality = metric.getSleepQuality();
        metricDto.foodQuality =metric.getFoodQuality();
        metricDto.dateTime = metric.getDateTime();
        metricDto.height = metric.getHeight();
        metricDto.guid = metric.getGuid();
        return metricDto;
    }

    //dashboard
    //BMI
    //blood pressure
    //sleep
    //activity
    //food quality

    @Override
    public int compareTo(MetricDto m) {
        return getDateTime().compareTo(m.getDateTime());
    }

    public MetricDto() {
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSystolic() {
        return systolic;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public Integer getSleep() {
        return sleep;
    }

    public Integer getActivity() {
        return activity;
    }

    public Integer getSleepQuality() {
        return sleepQuality;
    }

    public Integer getFoodQuality() {
        return foodQuality;
    }

    public Integer getActivityQuality() {
        return activityQuality;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }

    public String getGuid() {
        return guid;
    }
}
