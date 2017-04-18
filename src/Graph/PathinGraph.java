package Graph;

public class PathinGraph {
	public static void main(String args[])
    {
        // Create a graph given in the above diagram
        graph g = new graph(4);
        g.addedge(0, 1);
        g.addedge(0, 2);
        g.addedge(1, 2);
        g.addedge(2, 0);
        g.addedge(2, 3);
        g.addedge(3, 3);
 
        int u = 1;
        int v = 3;
        
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
 
        u = 3;
        v = 1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
    }
	
}
