package co.edu.uptc.presenter;
import co.edu.uptc.pojos.Base;
import java.awt.*;
public class Presenter implements ContractManager.Presenter {
    private ContractManager.View view;
    private ContractManager.Model model;
    @Override
    public void setInfo(Base base) {
        view.setInfo(base);
    }
    @Override
    public void setView(ContractManager.View view) {
        this.view = view;
    }
    @Override
    public void setModel(ContractManager.Model model) {
        this.model = model;
    }
    @Override
    public void loadData() {
        model.loadData();
    }
    @Override
    public void setRectangle(Rectangle rectangle) {
        view.setRectangle(rectangle);
    }
}