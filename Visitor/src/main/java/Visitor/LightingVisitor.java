package Visitor;
class LightingVisitor implements IExhibitVisitor{
    public void visit(Painting painting) {
        System.out.println("Lightning adjusted for painting: "+painting);
    }
    public void visit(Sculpture sculpture) {
        System.out.println("Lightning adjusted for sculpture: "+sculpture);
    }
}