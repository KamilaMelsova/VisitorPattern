package Visitor;
public class Painting extends Exhibit{
    public Painting(String title, String creator) {
        super(title, creator);
    }
    @Override
    public void accept(IExhibitVisitor visitor) {
        visitor.visit(this);
    }
}