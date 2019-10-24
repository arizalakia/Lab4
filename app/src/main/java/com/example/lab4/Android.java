package com.example.lab4;

public class Android {
    int logo;
    String androidNames, androidVersion, androidAPI, releaseDates;

    public Android(int logo, String androidNames, String androidVersion, String androidAPI, String releaseDates) {
        this.logo = logo;
        this.androidNames = androidNames;
        this.androidVersion = androidVersion;
        this.androidAPI = androidAPI;
        this.releaseDates = releaseDates;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getAndroidNames() {
        return androidNames;
    }

    public void setAndroidNames(String androidNames) {
        this.androidNames = androidNames;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getAndroidAPI() {
        return androidAPI;
    }

    public void setAndroidAPI(String androidAPI) {
        this.androidAPI = androidAPI;
    }

    public String getReleaseDates() {
        return releaseDates;
    }

    public void setReleaseDates(String releaseDates) {
        this.releaseDates = releaseDates;
    }
}
