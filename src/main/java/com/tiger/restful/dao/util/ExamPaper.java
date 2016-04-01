package com.tiger.restful.dao.util;

import com.alibaba.fastjson.JSONArray;

/**
 * 考卷类
 */
public class ExamPaper {

    private JSONArray userAnswers;
    private JSONArray examAnswers;

    private ExamPaper(JSONArray userAnswers, JSONArray examAnswers) {
        this.userAnswers = userAnswers;
        this.examAnswers = examAnswers;
    }

    public JSONArray getUserAnswers(Question question) {
        return (JSONArray) userAnswers.get(question.ordinal());
    }

    public JSONArray getExamAnswers(Question question) {
        return (JSONArray) examAnswers.get(question.ordinal());
    }

    public static ExamPaper getInstance(JSONArray userAnswers, JSONArray examAnswers) {
        return new ExamPaper(userAnswers, examAnswers);
    }

}
