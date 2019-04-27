package com.ila.adv.ADV.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
public class Advertesment {
    @Id
    @JsonProperty("advId")
    private int advId;
    @JsonProperty("advName")
    private String advName;
    @JsonProperty("advType")
    private String advType;
    @JsonProperty("postedBy")
    private String postedBy;
    @JsonProperty("postedOn")
    private Date postedOn;

    public Advertesment() {
    }

    @JsonProperty("About_adv")
    private String text;

    @JsonCreator
    public Advertesment(int advId,String advName,
                         String advType, String postedBy,
                        Date postedOn, String text) {
        this.advId=advId;
        this.advName = advName;
        this.advType = advType;
        this.postedBy = postedBy;
        this.postedOn = postedOn;
        this.text = text;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public String getAdvType() {
        return advType;
    }

    public void setAdvType(String advType) {
        this.advType = advType;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
