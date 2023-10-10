package com.aptech.exam.Repository;

import com.aptech.exam.models.exams;
import org.springframework.data.repository.CrudRepository;

public interface ExamRepository extends CrudRepository<exams, String> {
}
