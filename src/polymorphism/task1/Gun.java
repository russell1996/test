package polymorphism.task1;

public class Gun extends Weapon{
    @Override
    public void shot() {
        super.shot();
        System.out.println("Дищь, Дыщь...");
    }
}
