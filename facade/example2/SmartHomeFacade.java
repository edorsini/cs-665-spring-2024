package patterns.facade.example2;

public class SmartHomeFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Light light;
    TV tv;
    Popper popper;
    Projector projector;
    Screen screen;

    public SmartHomeFacade(Amplifier amp, Tuner tuner,
                           DvdPlayer dvd, CdPlayer cd, TV tv, Light light, Popper popper, Projector projector, Screen screen) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.tv = tv;
        this.light = light;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
//        popper.on();
//        popper.pop();
//        light.dim(10);
//        screen.down();
//        projector.on();
//        projector.wideScreenMode();
//        amp.on();
//        amp.setDvd(dvd);
//        amp.setSurroundSound();
//        amp.setVolume(5);
//        dvd.on();
//        dvd.play(movie);
    }
}
