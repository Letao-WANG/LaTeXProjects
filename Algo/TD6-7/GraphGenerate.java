public class GraphGenerate {

    DefaultDirectedWeightedGraph<String, DefaultEdge> g;

    public GraphGenerate() {}

    public void createGraph() {
        g = new DefaultDirectedWeightedGraph<>
        (DefaultEdge.class);
        
        g.addVertex("v1");
        g.addVertex("v2");
        g.addVertex("v3");

        g.addEdge("v1", "v2");
        g.addEdge("v2", "v3");
    }

    public void visualiser() throws IOException {
        JGraphXAdapter<String, DefaultEdge> graphAdapter = 
        new JGraphXAdapter<>(g);
        
        mxIGraphLayout layout = 
        new mxCircleLayout(graphAdapter);
        
        layout.execute(graphAdapter.getDefaultParent());
        BufferedImage image = 
        mxCellRenderer.createBufferedImage
        (graphAdapter, null, 2, Color.WHITE, true, null);
        
        File imgFile = new File("src/main/java/graph.png");
        ImageIO.write(image, "PNG", imgFile);
    }
}
