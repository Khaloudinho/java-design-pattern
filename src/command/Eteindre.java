package command;

public class Eteindre implements Command {

    private AppareilElectronique appareilElectronique;

    public Eteindre(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    public void eteindre(AppareilElectronique appareilElectronique){
        this.appareilElectronique = appareilElectronique;
    }

    @Override
    public void executer() {
        this.appareilElectronique.eteindre();
    }
}
