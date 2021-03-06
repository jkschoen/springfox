package com.mangofactory.swagger.models.dto.builder;

import com.mangofactory.swagger.models.dto.ResponseMessage;

public class ResponseMessageBuilder {
  private int code;
  private String message;
  private String responseModel;

  public ResponseMessageBuilder code(int code) {
    this.code = code;
    return this;
  }

  public ResponseMessageBuilder message(String message) {
    this.message = message;
    return this;
  }

  public ResponseMessageBuilder responseModel(String responseModel) {
    this.responseModel = responseModel;
    return this;
  }

  public ResponseMessage build() {
    return new ResponseMessage(code, message, responseModel);
  }
}