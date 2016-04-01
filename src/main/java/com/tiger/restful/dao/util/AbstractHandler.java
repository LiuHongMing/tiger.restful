package com.tiger.restful.dao.util;

import com.alibaba.fastjson.JSONArray;

public abstract class AbstractHandler implements AnswerExecutor {

    JSONArray userAnswer;
    JSONArray examAnswer;

    int end = 0;

    public void before(ExamPaper paper, Question question) {
        this.userAnswer = paper.getUserAnswers(question);
        this.examAnswer = paper.getExamAnswers(question);
    }

    public boolean isCorrect(Object thisVal, Object targt) {
        if (targt.equals(thisVal)) {
            return true;
        }
        return false;
    }

}
