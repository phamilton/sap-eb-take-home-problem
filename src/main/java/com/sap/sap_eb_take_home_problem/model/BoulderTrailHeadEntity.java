package com.sap.sap_eb_take_home_problem.model;

import jakarta.persistence.Entity;

// if real DB , this one should be @Entity, however, since we read from CSV, I just use basic model
@Entity
public class BoulderTrailHeadEntity {
    private Long fId;
    private Boolean restrooms;
    private Boolean picnic;
    private Boolean fishing;
    private String aka;
    private String accessType;
    private String accessID;
    private String facilityClass;
    private String address;
    private Boolean fee;
    private Boolean bikeRack;
    private Boolean bikeTrail;
    private Boolean dogTube;
    private Boolean grills;
    private Boolean trashCans;
    private Integer parkSpaces;
    private Boolean adaSurface;
    private Boolean adaToilet;
    private Boolean adaFishing;
    private Boolean adaCamping;
    private Boolean adaPicnic;
    private Boolean adaTrail;
    private Boolean adaParking;
    private Boolean adaFacility;
    private String adaFacName;
    private Boolean horseTrail;
    private String dateFrom;
    private String dateTo;
    private Boolean recycleBin;
    private Boolean dogCompost;
    private String accessName;
    private Boolean thLeash;

    // Getters and Setters
    public Long getFid() {
        return fId;
    }

    public void setFid(Long id) {
        this.fId = id;
    }

    public Boolean getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(Boolean restrooms) {
        this.restrooms = restrooms;
    }

    public Boolean getPicnic() {
        return picnic;
    }

    public void setPicnic(Boolean picnic) {
        this.picnic = picnic;
    }

    public Boolean getFishing() {
        return fishing;
    }

    public void setFishing(Boolean fishing) {
        this.fishing = fishing;
    }

    public String getAka() {
        return aka;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getAccessID() {
        return accessID;
    }

    public void setAccessID(String accessID) {
        this.accessID = accessID;
    }

    public String getFacilityClass() {
        return facilityClass;
    }

    public void setFacilityClass(String facilityClass) {
        this.facilityClass = facilityClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getFee() {
        return fee;
    }

    public void setFee(Boolean fee) {
        this.fee = fee;
    }

    public Boolean getBikeRack() {
        return bikeRack;
    }

    public void setBikeRack(Boolean bikeRack) {
        this.bikeRack = bikeRack;
    }

    public Boolean getBikeTrail() {
        return bikeTrail;
    }

    public void setBikeTrail(Boolean bikeTrail) {
        this.bikeTrail = bikeTrail;
    }

    public Boolean getDogTube() {
        return dogTube;
    }

    public void setDogTube(Boolean dogTube) {
        this.dogTube = dogTube;
    }

    public Boolean getGrills() {
        return grills;
    }

    public void setGrills(Boolean grills) {
        this.grills = grills;
    }

    public Boolean getTrashCans() {
        return trashCans;
    }

    public void setTrashCans(Boolean trashCans) {
        this.trashCans = trashCans;
    }

    public Integer getParkSpaces() {
        return parkSpaces;
    }

    public void setParkSpaces(Integer parkSpaces) {
        this.parkSpaces = parkSpaces;
    }

    public Boolean getAdaSurface() {
        return adaSurface;
    }

    public void setAdaSurface(Boolean adaSurface) {
        this.adaSurface = adaSurface;
    }

    public Boolean getAdaToilet() {
        return adaToilet;
    }

    public void setAdaToilet(Boolean adaToilet) {
        this.adaToilet = adaToilet;
    }

    public Boolean getAdaFishing() {
        return adaFishing;
    }

    public void setAdaFishing(Boolean adaFishing) {
        this.adaFishing = adaFishing;
    }

    public Boolean getAdaCamping() {
        return adaCamping;
    }

    public void setAdaCamping(Boolean adaCamping) {
        this.adaCamping = adaCamping;
    }

    public Boolean getAdaPicnic() {
        return adaPicnic;
    }

    public void setAdaPicnic(Boolean adaPicnic) {
        this.adaPicnic = adaPicnic;
    }

    public Boolean getAdaTrail() {
        return adaTrail;
    }

    public void setAdaTrail(Boolean adaTrail) {
        this.adaTrail = adaTrail;
    }

    public Boolean getAdaParking() {
        return adaParking;
    }

    public void setAdaParking(Boolean adaParking) {
        this.adaParking = adaParking;
    }

    public Boolean getAdaFacility() {
        return adaFacility;
    }

    public void setAdaFacility(Boolean adaFacility) {
        this.adaFacility = adaFacility;
    }

    public String getAdaFacName() {
        return adaFacName;
    }

    public void setAdaFacName(String adaFacName) {
        this.adaFacName = adaFacName;
    }

    public Boolean getHorseTrail() {
        return horseTrail;
    }

    public void setHorseTrail(Boolean horseTrail) {
        this.horseTrail = horseTrail;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Boolean getRecycleBin() {
        return recycleBin;
    }

    public void setRecycleBin(Boolean recycleBin) {
        this.recycleBin = recycleBin;
    }

    public Boolean getDogCompost() {
        return dogCompost;
    }

    public void setDogCompost(Boolean dogCompost) {
        this.dogCompost = dogCompost;
    }

    public String getAccessName() {
        return accessName;
    }

    public void setAccessName(String accessName) {
        this.accessName = accessName;
    }

    public Boolean getThLeash() {
        return thLeash;
    }

    public void setThLeash(Boolean thLeash) {
        this.thLeash = thLeash;
    }
}
