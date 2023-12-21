package disign_patterns.behavioral.visitor;

public class PlainTextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Text-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Text-anchor");
    }
}
