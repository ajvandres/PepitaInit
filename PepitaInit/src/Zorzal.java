public class Zorzal extends Pajaro {

    public Zorzal(int energia) {
        super(energia);
    }

    public void cantar() {
        this.energia = this.energia - 20;
    }
}
