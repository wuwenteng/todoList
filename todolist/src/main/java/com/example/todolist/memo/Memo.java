package com.example.todolist.memo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "memo")
public class Memo {
    @Id
    @GeneratedValue
    private String Message;
    private String status;
}
