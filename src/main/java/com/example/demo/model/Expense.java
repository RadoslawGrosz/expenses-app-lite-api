package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.HashMap;

@Document(collection = "expenses")
public class Expense {

    @Id
    private final ObjectId _id;
    private final String name;
    private final String date;
    private final Float amount;
    private final String status;
    private final String description;
    private final HashMap<String, String> img;

    public Expense(@JsonProperty("id") ObjectId _id,
                @JsonProperty("name") String name,
                @JsonProperty("date") String date,
                @JsonProperty("amount") Float amount,
                @JsonProperty("status") String status,
                @JsonProperty("description") String description,
                @JsonProperty("img") HashMap<String, String> img) {
        this._id = _id;
        this.name = name;
        this.date = date;
        this.amount  = amount;
        this.status = status;
        this.description = description;
        this.img = img;
    }

    public String getId() {
        return _id.toHexString();
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public Float getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public HashMap<String, String> getImg() {
        return img;
    }
}
