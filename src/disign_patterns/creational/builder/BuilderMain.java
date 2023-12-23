package disign_patterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));

        MovieBuilder builder = new MovieBuilder();

        presentation.export(builder);
//        PdfDocument pdfDocument = builder.getPdfDocument();
        builder.getMovie();
    }
}
