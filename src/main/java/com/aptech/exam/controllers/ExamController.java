package com.aptech.exam.controllers;

import com.aptech.exam.Repository.ExamRepository;
import com.aptech.exam.models.exams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "exams")
public class ExamController {
    @Autowired
    private ExamRepository categoryRepository;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap) {
        Iterable<exams> categories = categoryRepository.findAll();
        modelMap.addAttribute("exams", categories);
        return "exams";
    }
}
