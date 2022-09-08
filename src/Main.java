public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Magic magic1 = new Magic();
        Warrior warrior= new Warrior();
        HavingSuperAbility[] havingSuperAbilities ={magic, magic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility("premenilsupersposobnost");
            
        }
}{
    }
}