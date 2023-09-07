package hexlet.code.schemas;

import java.util.function.Predicate;

public class NumberSchema extends BaseSchema {
    public NumberSchema required() {
        Predicate<Object> predicateRequired = x -> x instanceof Integer;
        super.addPredicate(predicateRequired);
        return this;
    }

    public NumberSchema positive() {
        Predicate<Object> predicatePositive = x -> x instanceof Integer
                && (Integer) x > 0;
        super.addPredicate(predicatePositive);
        return this;
    }

    public NumberSchema range(int start, int end) {
        Predicate<Object> predicateRange = x -> x instanceof Integer
                && (Integer) x >= start && (Integer) x <= end;
        super.addPredicate(predicateRange);
        return this;
    }

}
