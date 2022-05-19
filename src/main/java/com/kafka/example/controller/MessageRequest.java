package com.kafka.example.controller;
/**
 * Java Record is introduced in Java14, and it is useful to hold the immutable data which is returned
 * from the database, CSV, RequestBody
 */
public record MessageRequest(String message){
}
