import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree( 120, 12, TreeType.OAK);
        System.out.println(myFavoriteOakTree.treeType);

        Tree myFavoriteMapleTree = new Tree( 90, 30, TreeType.MAPLE);

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
