import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree( 120, 12, TreeType.OAK);
        // Since we have private variables, we can not access them directly with System.out.println(myFavoriteOakTree.treeType);
        // We have to use getter:
        System.out.println(myFavoriteOakTree.getTreeType());
        System.out.println(myFavoriteOakTree.getHeightFt());
        System.out.println(myFavoriteOakTree.getTrunkDiameterInches());

        Tree myFavoriteMapleTree = new Tree( 90, 30, TreeType.MAPLE);
        System.out.println(myFavoriteMapleTree.getHeightFt());

        // Modify the value of those attributes from here: using a method within the class, that encapsulates the attributes.
        // This method will modify with its own particular values that are defined within itself.
        myFavoriteMapleTree.grow();
        // But if we want to assign a specific value from outside Tree class, we have to use setters:

        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);

        // LIBRARY RELATED TO COLORS. We access through the class name in both cases.
        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultWhite = Color.WHITE;
        // Create a default color:
        Color myDefaultBlue = Color.BLUE;
        Color brighterBlue = myDefaultBlue.brighter();

    }
}
