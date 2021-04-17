package com.example.demo.service;

import com.example.demo.dao.ExpenseDao;
import com.example.demo.model.Expense;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseDao expenseDao;

    @Autowired
    public ExpenseService(ExpenseDao expenseDao) {
        this.expenseDao = expenseDao;
    }

    public String addExpense(Expense expense) {
        return expenseDao.save(expense).getId();
    }

    public List<Expense> getExpenses() {
        return expenseDao.findAll();
    };

    public void delExpense(String id) {
        expenseDao.deleteById(id);
    }

    public void editExpense(Expense expense) {
//        Optional<Expense> foundExpense = expenseDao.findById(id);
        expenseDao.save(expense);
    }

}
