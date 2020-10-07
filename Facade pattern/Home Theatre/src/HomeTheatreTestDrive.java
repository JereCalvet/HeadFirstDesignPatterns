import hometheatredomain.*;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
        BlueRayPlayer blueRay = new BlueRayPlayer("BlueRay Player", amp);
        Projector projector = new Projector("Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, blueRay, projector, lights, screen, popper);
        homeTheater.watchMovie("Venom");
        System.out.println();
        homeTheater.endMovie();
        System.out.println();
        homeTheater.listenToRadio(105.3);
        System.out.println();
        homeTheater.endRadio();
    }
}
