package Visitor;
class AudioGuideVisitor implements IExhibitVisitor{
    public void visit(Painting painting) {
        System.out.println("Audio guide playing for painting: "+painting);
    }
    public void visit(Sculpture sculpture) {
        System.out.println("Audio guide playing for sculpture: "+sculpture);
    }
}
