package com.tiger.restful.dao.util;

public abstract class AbstractHandler implements AnswerExecutor {

    int end = 0;

    public boolean isCorrect(Object thisVal, Object targt) {
        if (targt.equals(thisVal)) {
            return true;
        }
        return false;
    }

}
