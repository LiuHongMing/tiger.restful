package com.tiger.restful.dao.util;

/**
 * 打分器类
 */
public class AnswerCalucator {

    private int score = 0;
    private ExamPaper examPaper;
    private AnswerExecutor executor;

    public AnswerCalucator(ExamPaper examPaper) {
        this(examPaper, new SingleHandler());
    }

    public AnswerCalucator(ExamPaper examPaper, AnswerExecutor executor) {
        this.examPaper = examPaper;
        this.executor = executor;
        before();
    }

    public void before() {
        if (executor != null)
            score += executor.handle(examPaper);
    }

    public AnswerCalucator calucate(AnswerExecutor handler) {
        score += handler.handle(examPaper);
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
