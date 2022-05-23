package com.kafka.example.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BankDetails {
    private Integer accID;
    private String name;
}
