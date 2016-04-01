package com.tiger.restful.dao.util;

import com.tiger.restful.utils.StringUtil;

import java.util.Iterator;

/**
 * 简答题打分类
 */
public class WordsHandler extends AbstractHandler {

    private int score = 5;

    @Override
    public int handle(AnswerCalucator calucator) {
        before(calucator.getExamPaper(), Question.WORDS);
        Iterator<Object> iter = userAnswer.iterator();
        while(iter.hasNext()) {
            String content = (String) iter.next();
            if (StringUtil.hasLength(content, 10))
                end += score;
        }
        return end;
    }

}
