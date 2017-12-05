package command;

public class Clignoter implements Command {

    private AppareilElectronique appareilElectronique;

    public Clignoter(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    public void clignoter(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    @Override
    public void executer() {
        this.appareilElectronique.clignoter();
    }
}
