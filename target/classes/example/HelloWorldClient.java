package example;public class HelloWorldClient {
  public static void main(String[] argv) {
    com.tempCorvesion.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
    //invoke business method
    service.celsiusToFahrenheit();  
  }
}
