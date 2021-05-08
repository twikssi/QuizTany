package by.quiz.QuizTany.controllers;

import by.quiz.QuizTany.model.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService service;

    @GetMapping("/quiz")
    public String getQuestion(Model model) {
        model.addAttribute("questions", service.findAllQuestion());

//        Question question = new Question();
//        question.setQuestion("Кто знаток джавы?");
//        question.setAnswers(List.of("Леля", "Инга", "Руслан", "Иллирион"));
//        question.setRightAnswers(List.of("Руслан"));
//
//        service.addQuestion(question);

        return "quiz.html";
    }
}
