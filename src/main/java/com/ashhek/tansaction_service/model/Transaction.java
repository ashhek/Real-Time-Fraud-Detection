package com.ashhek.transaction_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String userId;
    private double amount;
    private String type; // "CREDIT" or "DEBIT"
    private String description;
    private LocalDateTime timestamp = LocalDateTime.now();
}
