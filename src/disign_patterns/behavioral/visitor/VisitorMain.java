package disign_patterns.behavioral.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());
    }
}
