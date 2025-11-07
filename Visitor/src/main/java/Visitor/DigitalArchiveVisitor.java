package Visitor;
class DigitalArchiveVisitor implements IExhibitVisitor{
    public void visit(Painting painting){
        System.out.println("Digital Archive for painting: " + painting);
    }
    public void visit(Sculpture sculpture){
        System.out.println("Digital Archive for sculpture: " + sculpture);
    }
}
