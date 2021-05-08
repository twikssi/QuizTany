package by.quiz.QuizTany.model.service;

import by.quiz.QuizTany.model.bean.Question;
import by.quiz.QuizTany.model.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void addQuestion(Question question){
        questionRepository.save(question);
    }

    public List<Question> findAllQuestion(){
        return questionRepository.findAll();
    }
}
