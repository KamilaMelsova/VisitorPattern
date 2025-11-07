package Visitor;
interface IExhibitVisitor{
    void visit(Painting painting);
    void visit(Sculpture sculpture);
}