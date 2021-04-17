package com.example.demo.dao;

import com.example.demo.model.Expense;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseDao extends MongoRepository<Expense, String> {
    void deleteById(ObjectId id);
}
