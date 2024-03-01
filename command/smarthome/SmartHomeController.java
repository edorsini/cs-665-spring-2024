package patterns.command.smarthome;

public class SmartHomeController {
  public static void main(String[] args) {
    SmartHomeController remoteControl = new SmartHomeController();

    // Devices
    Light light = new Light("Living Room");
    TV tv = new TV("Living Room");
    Stereo stereo = new Stereo("Living Room");
    Hottub hottub = new Hottub();

    // Wrap devices with command
    LightOnCommand lightOn = new LightOnCommand(light);
    StereoOnCommand stereoOn = new StereoOnCommand(stereo);
    TVOnCommand tvOn = new TVOnCommand(tv);
    HottubOnCommand hottubOn = new HottubOnCommand(hottub);

    Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
//    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  }

  public void setCommand() {
    // maybe set 0 to set party off
    // maybe set 1 to set party on
  }
}


