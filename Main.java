import java.util.*;

class Main {
    public static void main(String[] args) {
//        Polyomino P = new Polyomino("[(0,0), (0,1), (0,2), (0,3), (0,4), (1,2), (1,3), (2,1), (2,2), (3,0), (3,1), (3,2), (3,3), (3,4)]");
//        P.dilation(3);
//        P.rotation();
//        P.draw();
        List<Polyomino> l = Manipulate.openFile();
        for (Polyomino p : l) {
            p.reflection_horizontal();
        }
        //Polyomino.draw(l);
        List<List<Polyomino>> tout = new LinkedList<List<Polyomino>>();

        tout.add(Manipulate.generateAllFixedPolyominoes(4, 3));
        tout.add(Manipulate.generateAllFreePolyominoes(3,3));
        tout.add(Manipulate.generic(7, "Fixed"));
        tout.add(Manipulate.HX_VX(12));
        tout.add(Manipulate.generic(12, "HI"));
        tout.add(Manipulate.generic(12, "VI"));
        tout.add(Manipulate.generic(12, "A"));
        tout.add(Manipulate.generic(12, "D"));
        tout.add(Manipulate.generic(13, "R"));
        tout.add(Manipulate.generic(25, "R2"));

        for (List<Polyomino> all : tout) {
            for (Polyomino p: all) {
                p.canonicalForm();
            }
            //System.out.println(all);
            System.out.println(all.size());
            //Manipulate.draw(all);
        }





		int[][] conf = new int[][]{
			{ 0, 0, 1, 0, 1, 1, 0},
			{ 1, 0, 0, 1, 0, 0, 1},
			{ 0, 1, 1, 0, 0, 1, 0},
			{ 1, 0, 0, 1, 0, 0, 0},
			{ 0, 1, 0, 0, 0, 0, 1},
			{ 0, 0, 0, 1, 1, 0, 1},
		};

        //System.out.println(ExactCover.resolve(conf));
		int[][] conf2 = new int[][]{
			{ 0, 0, 1, 0, 1, 1, 0},
			{ 1, 0, 0, 1, 0, 0, 0},
			{ 0, 1, 1, 0, 0, 1, 0},
			{ 1, 0, 0, 1, 0, 0, 1},
			{ 0, 1, 0, 0, 0, 0, 1},
			{ 0, 0, 0, 1, 1, 0, 1},
		};

        //System.out.println(ExactCover.resolve(conf2));
		
        /*System.out.println(ExactCover.generateSubsets(1,7,2));
        int [][] M = ExactCover.generateMatrix(ExactCover.generateSubsets(1,7,2));
        ExactCover.printMatrix(M);
        System.out.println(ExactCover.resolve(M));*/
        
		System.out.println(ExactCover.generateAllSubsets(6));
		int [][] M = ExactCover.generateMatrix(ExactCover.generateAllSubsets(6));
		ExactCover.printMatrix(M);
        System.out.println(ExactCover.resolve(M));
    }
}
