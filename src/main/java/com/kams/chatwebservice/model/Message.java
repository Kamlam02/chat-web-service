package com.kams.chatwebservice.model;

public record Message(String senderName,
                      String receiverName,
                      String message,
                      String date,
                      Status status) {
}
