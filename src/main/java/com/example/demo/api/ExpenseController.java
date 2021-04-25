package com.example.demo.api;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/api/expense")
@RestController
@CrossOrigin()
public class ExpenseController {

    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping()
    public String addExpense(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    @GetMapping()
    public List<Expense> getExpenses() {
        return expenseService.getExpenses();
    }

    @DeleteMapping()
    public void delExpense(@RequestBody String id) {
        expenseService.delExpense(id);
    }

    @PutMapping()
    public void putExpense(@RequestBody Expense expense) {
        expenseService.editExpense(expense);
    }

}
