package com.aptech.exam.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="exams")
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class exams {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private int duration;
    private String description;
    private Timestamp created_at;
    private Timestamp updated_at;

}
