package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ladder implements Iterable<Line> {
    private final List<Line> lines;

    private Ladder(List<Line> lines) {
        this.lines = lines;
    }

    public static Ladder of(int count, int height) {
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            lines.add(Line.from(count, new RandomBooleanStrategy()));
        }
        return new Ladder(lines);
    }

    @Override
    public Iterator<Line> iterator() {
        return lines.iterator();
    }
}
