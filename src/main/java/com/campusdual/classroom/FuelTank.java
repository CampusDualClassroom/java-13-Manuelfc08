package com.campusdual.classroom;

public class FuelTank {
  public double actualFuel;

  public FuelTank() {
    this.actualFuel = 0;
  }

  public double getActualFuel() {
    return actualFuel;
  }

  public void setActualFuel(double actualFuel) {
    if (actualFuel >= 0) {
      this.actualFuel = actualFuel;
    } else {
      System.out.println("No se puede asignar un valor negativo al combustible.");
    }
  }

  public void showDetails() {
    System.out.println("El nivel actual de combustible es: " + getActualFuel() + " litros.");
  }
}
