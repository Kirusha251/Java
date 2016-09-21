package by.bstu.achramionok.education.exception;

/**
 * Created by Kirill on 20.09.2016.
 */
public class EduException extends Exception {
    public EduException(Throwable e) {
        initCause(e);
    }
}
