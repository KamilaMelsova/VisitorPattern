package Visitor;
class Sculpture extends Exhibit{
    public Sculpture(String title, String creator){
        super(title, creator);
    }
    @Override
    public void accept(IExhibitVisitor visitor) {
        visitor.visit(this);
    }
}