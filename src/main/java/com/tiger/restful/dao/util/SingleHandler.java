package com.tiger.restful.dao.util;

import org.apache.log4j.Logger;

/**
 * 单选题打分类
 */
public class SingleHandler extends AbstractHandler {

    private static Logger logger = Logger.getLogger(SingleHandler.class);

    private int score = 2;

    @Override
    public int handle(AnswerCalucator calucator) {
        before(calucator.getExamPaper(), Question.SINGLE);
        int size = userAnswer.size();
        for (int i = 0; i < size; i++) {
            try {
                String ua = (String) userAnswer.get(i);
                String ea = (String) examAnswer.get(i);
                if (isCorrect(ua, ea)) {
                    end += score;
                }
            } catch (Exception e) {
                logger.error("用户答案与考题答案不匹配", e);
            }

        }
        return end;
    }

}
