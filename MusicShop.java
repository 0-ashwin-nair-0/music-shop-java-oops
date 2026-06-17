abstract class Instrument {
    private String name;
    protected int year;
    public Instrument(String name, int year){
        this.name = name;
        this.year = year;
    }
    //abstract method
    abstract String play();


    //concrete method
    public String getInstrumentDetails(){
        return "Instrument: "+name+"\n Year of the instrument: "+year;
    }

    public String getName() {
        return name;
    }
}

interface Tunable{
     abstract String tune();
     abstract String adjustPitch(boolean up);
}

interface Maintanable{
    abstract String clean();
    abstract String inspect();
}

class StringedInstrument extends Instrument{
    private int numberOfStrings;
    public StringedInstrument(String name , int year, int numberOfStrings){
        super(name,year);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    String play() {
        return "Playing the Stringed Instrument";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails()+"Number of Strings: "+numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}

class Guitar extends StringedInstrument implements Tunable, Maintanable{
    private String guitarType;
    Guitar(String name, int year, int numberOfStrings, String guitarType){
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }

    @Override
    String play() {
        return "Playing the guitar of type "+guitarType+" with "+getNumberOfStrings()+" strings";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails()+"\nType: "+guitarType;
    }

    @Override
    public String tune() {
        return "Tuning the guitar "+guitarType;
    }

    @Override
    public String adjustPitch(boolean up) {
        return up ?"Increasing the pitch of the guitar" : "Decreasing the pitch of the guitar";
    }

    @Override
    public String clean() {
        return "Cleaning the guitar "+guitarType;
    }

    @Override
    public String inspect() {
        return "Inspecting the guitar "+guitarType;
    }
}

class Piano extends Instrument implements Tunable , Maintanable{
    private boolean isGrand;
    Piano(String name , int year, boolean isGrand){
        super(name, year);
        this.isGrand = isGrand;
        }
    @Override
    String play(){
        return "Playing the "+(isGrand ? "Grand":"Upright")+"Piano";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails()+"\nType: "+(isGrand ? "Grand":"Upright");
    }

    @Override
    public String tune() {
        return "Tuning the piano";
    }

    @Override
    public String inspect() {
        return "Inspecting the piano "+(isGrand ? "grand":"upright")+"\nFrom year: "+year;
    }

    @Override
    public String adjustPitch(boolean up) {
        return up ? "Increasing the pitch of the piano" : "Decreasing the pitch of the piano";
    }

    @Override
    public String clean() {
        return "Cleaning the piano";
    }
}

public class MusicShop{
    public static void main(String[] args) {

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar("Martin", 2020, 6, "electric");
        instruments[1] = new Piano("Yamaha Piano", 2015, true);
        instruments[2] = new Piano("Kawai",2019,false);

        for(Instrument instrument : instruments)
        {
            System.out.println(instrument.play());
            System.out.println(instrument.getInstrumentDetails());
        }

        for(Instrument instrument : instruments)
        {
            System.out.println("Working with "+instrument.getName());
            if(instrument instanceof Tunable)
            {
                Tunable tunableInstrument = (Tunable) instrument;
                System.out.println(tunableInstrument.tune());
                System.out.println(tunableInstrument.adjustPitch(true));
            }

            if(instrument instanceof Maintanable)
            {
                Maintanable maintainableInstrument = (Maintanable) instrument;
                System.out.println(maintainableInstrument.clean());
                System.out.println(maintainableInstrument.inspect());
            }
            System.out.println("=================================");
        }
    }
}
