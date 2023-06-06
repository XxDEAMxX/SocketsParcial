package co.edu.uptc.presenter;
import co.edu.uptc.model.Model;
import co.edu.uptc.view.MyFrame;
public class Manager {
    private ContractManager.View view;
    private ContractManager.Presenter presenter;
    private ContractManager.Model model;
    public Manager(String ip, int port) {
        view = new MyFrame();
        presenter = new Presenter();
        model = new Model(ip, port);
        createMVP();
    }
    public void runProject() {
        view.start();
        presenter.loadData();
    }
    public void createMVP() {
        presenter.setView(view);
        presenter.setModel(model);
        model.setPresenter(presenter);
    }
}
