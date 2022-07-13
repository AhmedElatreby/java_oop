import java.awt.Color;

public class Tree {

    protected static Color trunkColor = new Color(102,51,0);

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;

    public Tree(double heightFt, double trunkDiameterInches,
         TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public static Color getTrunkColor() {
        return trunkColor;
    }

    public static void setTrunkColor(Color trunkColor) {
        Tree.trunkColor = trunkColor;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public void grow() {
        this.heightFt = heightFt + 10;
        this.trunkDiameterInches = trunkDiameterInches + 1;
    }

    public void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("That's a tall " + this.treeType +
                    " tree!");
        }
    }

}
