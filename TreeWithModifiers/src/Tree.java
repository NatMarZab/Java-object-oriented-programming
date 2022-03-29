import java.awt.*;

public class Tree {
    // with access modifiers:
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    //Constructor:
    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    //Getters and setters.
    // 1) Getters:
    public double getHeightFt() {
        return heightFt;
    }
    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }
    public TreeType getTreeType() {
        return treeType;
    }
    // Setters:
    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }
    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }
    //There is no way to modify the treetype once the tree is created. So, no setter for it.
    public void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }
    //class methods:
    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }
    //instance methods:
    void announceTallTree() {
        if(this.heightFt > 100) {
            System.out.println("That´s a tall " + this.treeType + " tree!");
        }
    }
}