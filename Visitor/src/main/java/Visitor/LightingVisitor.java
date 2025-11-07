package Visitor;
class LightingVisitor implements IExhibitVisitor{
    public void visit(Painting painting) {
        System.out.println("Lighting adjusted for painting: "+painting);
    }
    public void visit(Sculpture sculpture) {
        System.out.println("Lighting adjusted for sculpture: "+sculpture);
    }

}
