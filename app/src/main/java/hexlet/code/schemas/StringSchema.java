package hexlet.code.schemas;

import java.util.function.Predicate;

public class StringSchema extends BaseSchema {
    public void required() {
        Predicate<Object> predicateRequired = x -> x instanceof String && !x.equals("");
        super.addPredicate(predicateRequired);
    }

    public void minLength(int number) {
        Predicate<Object> predicateMinLength = x -> x instanceof String
                && x.toString().length() >= number;
        super.addPredicate(predicateMinLength);
    }

    public void contains(String str) {
        Predicate<Object> predicateContains = x -> x instanceof String
                && x.toString().contains(str);
        super.addPredicate(predicateContains);
    }
}
