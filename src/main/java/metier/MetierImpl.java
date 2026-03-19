package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    // Setter pour injection
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 2;
    }
}