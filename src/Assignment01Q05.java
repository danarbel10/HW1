public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        if (i == j) {
            return 0;
        }

        int size = m.length;
        int[] distances = new int[size];

        for (int v = 0; v < size; v++) {
            distances[v] = -1 ; 
        }
        distances[i] = 0;
        for (int step = 0 ; step < size ; step++){
            for (int current = 0; current < size; current++) {
                if (distances[current] == step){
                    for (int k = 0 ; k < size ; k++){
                        if (m[current][k] == 1 && distances[k] == -1){
                            distances[k] = step + 1;
                            if (k == j){
                                return distances[k];
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}