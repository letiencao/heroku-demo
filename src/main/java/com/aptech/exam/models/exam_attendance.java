package com.aptech.exam.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="exam_attendance")
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class exam_attendance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id;
    private int exam_id;
    private int scheduler_id;
    private String student_roll_no ;
}
