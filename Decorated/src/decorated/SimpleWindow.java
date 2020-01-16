package decorated;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        // Draw window
    }
    @Override
    public String getDescription() {
        return "simple window";
    }

}
