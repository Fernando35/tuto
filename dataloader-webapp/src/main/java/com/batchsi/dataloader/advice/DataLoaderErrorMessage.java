package com.batchsi.dataloader.advice;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DataLoaderErrorMessage {

    private String errorCode;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
