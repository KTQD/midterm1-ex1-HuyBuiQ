public class MP3 extends Item{
    public int duration;

    public MP3(java.lang.String name, java.lang.String description, java.lang.String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }
    @Override
    public void showInfo(){
        System.out.println("Ten MP3: "+name);
        System.out.println("Mo ta" + getDescription());
        System.out.println("ID: "+ID);
        System.out.println("Gia: "+price);
        System.out.println("Do dai" +duration);
    }
}
