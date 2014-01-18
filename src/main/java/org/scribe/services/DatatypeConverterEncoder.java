package org.scribe.services;

import javax.xml.bind.*;

public class DatatypeConverterEncoder extends Base64Encoder
{
  @Override
  public String encode(byte[] bytes)
  {
    return DatatypeConverter.printBase64Binary(bytes);
  }

  @Override
  public String getType()
  {
    return "DatatypeConverter";
  }
  
  public static void main(String[] args) {
	System.out.println("ZN8H97DI2Z1WAMUWNRIAC5F79LSESJ");
	System.out.println(DatatypeConverter.printBase64Binary("ZN8H97DI2Z1WAMUWNRIAC5F79LSESJ".getBytes()));
}
}
