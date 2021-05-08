package by.quiz.QuizTany.controllers;

import by.quiz.QuizTany.model.bean.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateQuestionController {

    @GetMapping("/create")
    public String getCreateQuestion(@ModelAttribute("inputquestion") Question question){
        return "create";
    }

    @PostMapping("/create")
    public String addQuestion(@ModelAttribute("inputquestion") Question question){
        System.out.println(question.getQuestion());
        return "redirect:/quiz";
    }
}
