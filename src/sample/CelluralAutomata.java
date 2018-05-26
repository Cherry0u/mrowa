package sample;

import org.jetbrains.annotations.Nullable;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public interface CelluralAutomata {/*też zmienic na bardziej uniwersalny*/

    public void process();
    public void addElement(int x, int y, @Nullable Color color, @Nullable Direction direction);
    public void editCanvas(Canvas canvas);
    public int getWidth();
    public int getHeight();
    public void restart();
}
