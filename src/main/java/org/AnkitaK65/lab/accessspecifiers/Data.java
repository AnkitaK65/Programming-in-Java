package org.AnkitaK65.lab.accessspecifiers;

public class Data {
    // Public field: accessible from anywhere
    public String publicData = "I am Public";

    // Private field: accessible only within this class
    private String privateData = "I am Private";

    // Getter for private data
    public String getPrivateData() {
        return privateData;
    }

    // Setter for private data
    public void setPrivateData(String privateData) {
        this.privateData = privateData;
    }
}
