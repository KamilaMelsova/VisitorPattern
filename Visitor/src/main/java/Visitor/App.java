package Visitor;
public class App {
    public static void main(String[] args){
        Exhibit e1 = new Painting("Starry night", "Van Gogh");
        Exhibit e2 = new Painting("David", "Michelangelo");
        IExhibitVisitor audioGuide = new AudioGuideVisitor();
        IExhibitVisitor lighting = new LightingVisitor();
        IExhibitVisitor digitalArchive = new DigitalArchiveVisitor();
        e1.accept(audioGuide);
        e2.accept(lighting);
        e2.accept(digitalArchive);
    }
}
