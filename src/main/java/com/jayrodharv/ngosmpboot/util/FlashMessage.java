package com.jayrodharv.ngosmpboot.util;

public class FlashMessage {

    private String type;   // success, danger, warning, info
    private String message;

    public FlashMessage(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
