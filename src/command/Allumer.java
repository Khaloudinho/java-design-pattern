package command;

public class Allumer implements Command {

    private AppareilElectronique appareilElectronique;

    public Allumer(AppareilElectronique appareilElectronique) {
        this.appareilElectronique = appareilElectronique;
    }

    public void allumer(AppareilElectronique appareilElectronique){
        this.appareilElectronique = appareilElectronique;
    }

    @Override
    public void executer() {
        this.appareilElectronique.allumer();
    }
}
