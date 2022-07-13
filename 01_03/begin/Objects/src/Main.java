public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,
                12, TreeType.OAK);

        Tree myMapleTree = new Tree(90, 20, TreeType.MAPLE);

        myMapleTree.announceTallTree();
        myFavoriteOakTree.announceTallTree();
    }
}
