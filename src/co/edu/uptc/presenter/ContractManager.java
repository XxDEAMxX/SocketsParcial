package co.edu.uptc.presenter;
import co.edu.uptc.pojos.Base;
import java.awt.*;
public interface ContractManager {
    interface Model {
        void setPresenter(Presenter presenter);
        void loadData();
    }
    interface View {
        void start();
        void setInfo(Base base);
        void setRectangle(Rectangle rectangle);
    }
    interface Presenter {
        void setView(View view);
        void setModel(Model model);
        void loadData();
        void setInfo(Base base);
        void setRectangle(Rectangle rectangle);
    }
}
