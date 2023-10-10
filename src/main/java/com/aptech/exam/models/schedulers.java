package com.aptech.exam.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name ="schedulers")
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class schedulers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String time_slot;
    private String location;
    private String exam_sitter;
    private Timestamp start_at ;
    private Timestamp end_at ;
}
