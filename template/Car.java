package patterns.template;

public class Car {

  private int year;
  private int noOfGears;

  public void setYear(int year) {
    // We set the input only if it is correct. Year of a car must be between 1885 and 2018.
    // Benz ran his first car in 1885, Daimler in 1886.
    if (year > 1885 || year < 2018) {
      this.year = year;
    } else {
      // If the check failed we log it and send a message.
      System.out.println("Year must be between 1900 and 2018");
    }
  }


  public int getYear() {
    return year;
  }

  public void setNoOfGears(int noOfGears) {
    // Input for the number of gears must be correct.
    if (noOfGears < 14) {
      this.noOfGears = noOfGears;
    } else {
      System.out.println("No of gears of a car can not be larger than 14");
    }
  }

  public int getNoOfGears() {
    return noOfGears;
  }
}
