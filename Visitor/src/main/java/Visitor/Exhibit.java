package Visitor;
abstract class Exhibit{
    public String title;
    public String creator;
    public Exhibit(String title, String creator){
        this.title = title;
        this.creator = creator;
    }
    public abstract void accept(IExhibitVisitor visitor);
    @Override
    public String toString(){
        return title+" by "+creator;
    }
}
