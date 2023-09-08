package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class BaseSchema {
    private List<Predicate<Object>> conditions = new ArrayList<>();

    public final void addPredicate(Predicate<Object> predicate) {
        conditions.add(predicate);
    }

    public final boolean isValid(Object obj) {
        for (Predicate<Object> predicate: conditions) {
            if (!predicate.test(obj)) {
                return false;
            }
        }
        return true;
    }
}
