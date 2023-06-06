package co.edu.uptc.pojos;

public class Base {
    private FigureInformation figureInformation;
    private PanelInformation panelInformation;
    private FrameInformation frameInformation;
    public Base() {
        figureInformation = new FigureInformation();
        panelInformation = new PanelInformation();
        frameInformation = new FrameInformation();
    }
    public void setFrameInformation(FrameInformation frameInformation) {
        this.frameInformation = frameInformation;
    }
    public FigureInformation getFigureInformation() {
        return figureInformation;
    }
    public PanelInformation getPanelInformation() {
        return panelInformation;
    }
    public void setPanelInformation(PanelInformation panelInformation) {
        this.panelInformation = panelInformation;
    }
    public FrameInformation getFrameInformation() {
        return frameInformation;
    }
    public void setFigureInformation(FigureInformation figureInformation) {
        this.figureInformation = figureInformation;
    }
}
