package com.tiger.restful.dao.util;

/**
 * 打分器类
 */
public class AnswerCalucator {

    private int score = 0;
    private ExamPaper examPaper;

    public AnswerCalucator(ExamPaper examPaper) {
        this.examPaper = examPaper;
    }

    public AnswerCalucator calucate(AnswerExecutor handler) {
        score += handler.handle(this);
        return this;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public ExamPaper getExamPaper() {
        return examPaper;
    }

    public void setExamPaper(ExamPaper examPaper) {
        this.examPaper = examPaper;
    }
}
