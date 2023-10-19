import view.CatView;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CatView catView = new CatView();
        catView.saveACat("murzik","persian", 4, 6);
        catView.getACat("murzik");
    }
}




